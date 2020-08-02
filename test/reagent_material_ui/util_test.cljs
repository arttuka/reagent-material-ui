(ns reagent-material-ui.util-test
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [cljs.test :refer-macros [deftest testing is use-fixtures]]
            ["react" :as react]
            [goog.object :as obj]
            [reagent-material-ui.util :refer [clj->js' js->clj']]))

(deftest clj->js'-test
  (testing "clj->js'"
    (testing "converts map keys to camelCase"
      (is (obj/equals #js {"fontSize" 14}
                      (clj->js' {:font-size 14}))))
    (testing "keeps map values in the same case"
      (is (obj/equals #js {"foo" "kebab-case"
                           "bar" "camelCase"
                           "baz" "PascalCase"}
                      (clj->js' {:foo :kebab-case
                                 :bar :camelCase
                                 :baz :PascalCase}))))
    (testing "keeps list items in the same case"
      (is (obj/equals #js ["kebab-case" "camelCase" "PascalCase"]
                      (clj->js' [:kebab-case :camelCase :PascalCase]))))
    (testing "doesn't convert aria- or data-attributenames"
      (is (obj/equals #js {"aria-label" "fail"
                           "data-value" "success"}
                      (clj->js' {:aria-label :fail
                                 :data-value :success}))))
    (testing "keeps PascalCase keys in the same case"
      (is (obj/equals #js {"InputProps" "foo"}
                      (clj->js' {:InputProps "foo"}))))))

(deftest js->clj'-test
  (testing "js->clj'"
    (testing "converts map keys to kebab-case and doesn't change string values"
      (is (= {:font-size   14
              :align-items "flex-end"}
             (js->clj' #js {"fontSize"   14
                            "alignItems" "flex-end"}))))
    (testing "keeps PascalCase keys in the same case"
      (is (= {:InputProps "foo"}
             (js->clj' #js {"InputProps" "foo"}))))
    (testing "converts numerical keys to numbers"
      (is (= {123 456
              456 "789"}
             (js->clj' #js {"123" 456
                            "456" "789"}))))
    (testing "doesn't convert ref values"
      (let [ref #js {:current nil}
            result (js->clj' #js {:ref ref
                                  :foo "foo"})]
        (is (= {:foo "foo"
                :ref ref}
               result))
        (is (identical? ref (:ref result)))))
    (testing "doesn't convert React elements"
      (let [elem (e "div" nil "foobar")
            result (js->clj' #js {:foo "foo"
                                  :elems #js [elem]})]
        (is (= {:foo "foo"
                :elems [elem]}
               result))
        (is (identical? elem (first (:elems result))))))))
