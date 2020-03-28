(ns reagent-material-ui.text-field-test
  (:require [cljsjs.react]
            [cljsjs.react.dom]
            [cljs.test :refer-macros [deftest testing is use-fixtures]]
            [reagent.core :as r]
            [reagent-material-ui.core.text-field :refer [text-field]]
            [reagent-material-ui.test-util :refer [unmount-fixture unmount render]]))

(use-fixtures :each unmount-fixture)

(defn set-cursor [node n]
  (set! (.-selectionStart node) n)
  (set! (.-selectionEnd node) n))

(defn get-cursor [node]
  (let [start (.-selectionStart node)
        end (.-selectionEnd node)]
    (is (= start end))
    start))

(deftest text-field-cursor-test
  (testing "changing textfield value moves cursor as many letters as were added"
    (testing "in a single line text-field"
      (let [value (r/atom "foobar")
            ref (.createRef js/React)
            component (fn []
                        [text-field {:value     @value
                                     :input-ref ref}])
            _ (render [component])
            node (.-current ref)]
        (.focus node)
        (set-cursor node 3)
        (reset! value "foobarbaz")
        (r/flush)
        (is (= 6 (get-cursor node)))
        (unmount)))
    (testing "in a multi line text-field"
      (let [value (r/atom "foo\nbar")
            ref (.createRef js/React)
            component (fn []
                        [text-field {:value     @value
                                     :input-ref ref
                                     :multiline true
                                     :rows      4}])
            _ (render [component])
            node (.-current ref)]
        (.focus node)
        (set-cursor node 3)
        (reset! value "foo\nbar\nbaz")
        (r/flush)
        (is (= 7 (get-cursor node)))
        (unmount)))
    (testing "in a flexible multi line text-field"
      (let [value (r/atom "foo\nbar")
            ref (.createRef js/React)
            component (fn []
                        [text-field {:value     @value
                                     :input-ref ref
                                     :multiline true
                                     :rows-max  4}])
            _ (render [component])
            node (.-current ref)]
        (.focus node)
        (set-cursor node 3)
        (reset! value "foo\nbar\nbaz")
        (r/flush)
        (is (= 7 (get-cursor node)))
        (unmount)))))

(deftest textarea-autosize-test
  (testing "autosized text area"
    (let [value (r/atom "")
          ref (.createRef js/React)
          component (fn []
                      [text-field {:value      @value
                                   :input-ref  ref
                                   :multiline  true
                                   :rows       2
                                   :rows-max   4
                                   :InputProps {:style {:line-height "20px"}}}])
          _ (render [component])
          node (.-current ref)]
      (testing "starts with the initial number of rows"
        (is (= 40 (.-clientHeight node))))
      (testing "grows as lines are added"
        (reset! value "1\n2\n3")
        (r/flush)
        (is (= 60 (.-clientHeight node))))
      (testing "doesn't grow beyond rows-max"
        (reset! value "1\n2\n3\n4\n5")
        (r/flush)
        (is (= 80 (.-clientHeight node))))
      (testing "shrinks as lines are removed"
        (reset! value "1\n2")
        (r/flush)
        (is (= 40 (.-clientHeight node))))
      (testing "doesn't shrink beyond initial rows"
        (reset! value "1")
        (r/flush)
        (is (= 40 (.-clientHeight node)))))))
