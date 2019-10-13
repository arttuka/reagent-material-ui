(ns reagent-material-ui.styles-test
  (:require [cljs.test :refer-macros [deftest testing is use-fixtures async]]
            [dommy.core :as dommy :refer-macros [sel1]]
            [reagent.core :as r]
            [reagent-material-ui.styles :refer [make-styles with-styles styled use-theme with-theme theme-provider]]
            [reagent-material-ui.test-util :refer [unmount-fixture unmount render]]))

(use-fixtures :each unmount-fixture)

(def primary-color "rgb(63, 81, 181)")
(def secondary-color "rgb(245, 0, 87)")
(def font-size "42px")
(def text-node "some text content")

(def basic-styles {:root  {:font-size font-size
                           :color     primary-color}
                   :child {:color secondary-color}})

(def theme-level-fn (fn [theme]
                      {:root  {:font-size font-size
                               :color     (get-in theme [:palette :primary :main])}
                       :child {:color (get-in theme [:palette :secondary :main])}}))

(def prop-level-fn {:root  {:font-size (fn [props]
                                         (:font-size props))
                            :color     primary-color}
                    :child {:color secondary-color}})

(def advanced-styles (fn [theme]
                       {:root  (fn [props]
                                 {:font-size (:font-size props)
                                  :color     (get-in theme [:palette :primary :main])})
                        :child {:color (get-in theme [:palette :secondary :main])}}))

(defn run-make-styles-test [styles]
  (let [use-styles (make-styles styles)
        component (fn []
                    (let [classes (use-styles {:font-size font-size})]
                      (r/as-element
                       [:div#make-styles-test-root {:class (:root classes)}
                        [:div#make-styles-test-child {:class (:child classes)}]])))]
    (render [:> component])
    (let [root (sel1 "#make-styles-test-root")]
      (is (= font-size (dommy/style root :font-size)))
      (is (= primary-color (dommy/style root :color))))
    (let [child (sel1 "#make-styles-test-child")]
      (is (= secondary-color (dommy/style child :color))))
    (unmount)))

(deftest make-styles-test
  (testing "make-styles"
    (testing "with basic styles"
      (run-make-styles-test basic-styles))
    (testing "with theme level fn"
      (run-make-styles-test theme-level-fn))
    (testing "with prop level fn"
      (run-make-styles-test prop-level-fn))
    (testing "with advanced styles"
      (run-make-styles-test advanced-styles))))

(defn run-with-styles-test [styles]
  (let [component (fn [props]
                    [:div#with-styles-test-root {:class (get-in props [:classes :root])}
                     [:div#with-styles-test-child {:class (get-in props [:classes :child])}
                      (:children props)]])
        styled-component ((with-styles styles) component)]
    (render [styled-component {:font-size font-size}
             text-node])
    (let [root (sel1 "#with-styles-test-root")]
      (is (= font-size (dommy/style root :font-size)))
      (is (= primary-color (dommy/style root :color))))
    (let [child (sel1 "#with-styles-test-child")]
      (is (= secondary-color (dommy/style child :color)))
      (is (= text-node (dommy/text child))))
    (unmount)))

(deftest with-styles-test
  (testing "with-styles"
    (testing "with basic styles"
      (run-with-styles-test basic-styles))
    (testing "with theme level fn"
      (run-with-styles-test theme-level-fn))
    (testing "with prop level fn"
      (run-with-styles-test prop-level-fn))
    (testing "with advanced styles"
      (run-with-styles-test advanced-styles))))

(defn run-styled-test [styles]
  (let [component (fn [props]
                    [:div#styled-test-root {:class (:class-name props)}
                     (:children props)])
        styled-component (styled component styles)]
    (render [styled-component {:font-size "42px"}
             text-node])
    (let [root (sel1 "#styled-test-root")]
      (is (= font-size (dommy/style root :font-size)))
      (is (= primary-color (dommy/style root :color)))
      (is (= text-node (dommy/text root))))
    (unmount)))

(deftest styled-test
  (testing "styled"
    (testing "with basic styles"
      (run-styled-test {:font-size font-size
                        :color     primary-color}))
    (testing "with function styles"
      (run-styled-test (fn [props]
                         {:font-size (:font-size props)
                          :color     (get-in props [:theme :palette :primary :main])})))))

(deftest use-theme-test
  (testing "use-theme"
    (let [component (fn []
                      (let [theme (use-theme)]
                        (r/as-element
                         [:div#use-theme-test-root
                          {:data-primarycolor   (get-in theme [:palette :primary :main])
                           :data-secondarycolor (get-in theme [:palette :secondary :main])}])))]
      (render [:> component])
      (let [root (sel1 "#use-theme-test-root")]
        (is (= "#3f51b5" (.. root -dataset -primarycolor)))
        (is (= "#f50057" (.. root -dataset -secondarycolor)))))))

(deftest with-theme-test
  (testing "with-theme"
    (let [component (fn [props]
                      [:div#with-theme-test-root
                       {:data-primarycolor   (get-in props [:theme :palette :primary :main])
                        :data-secondarycolor (get-in props [:theme :palette :secondary :main])
                        :data-fontsize       (:font-size props)}
                       (:children props)])
          wrapped-component (with-theme component)]
      (render [wrapped-component {:font-size font-size}
               text-node])
      (let [root (sel1 "#with-theme-test-root")]
        (is (= "#3f51b5" (.. root -dataset -primarycolor)))
        (is (= "#f50057" (.. root -dataset -secondarycolor)))
        (is (= font-size (.. root -dataset -fontsize)))
        (is (= text-node (dommy/text root)))))))

(deftest theme-provider-test
  (testing "theme-provider"
    (let [theme-1 {:foo "foo"}
          theme-2 {:bar "bar"}
          component (fn []
                      (let [theme (use-theme)]
                        (r/as-element [:div#theme-provider-test-root
                                       {:data-foo (:foo theme)
                                        :data-bar (:bar theme)}])))]
      (testing "should provide the theme"
        (render [theme-provider theme-1
                 [:> component]])
        (let [root (sel1 "#theme-provider-test-root")]
          (is (= "foo" (.. root -dataset -foo)))))
      (testing "should merge themes"
        (render [theme-provider theme-1
                 [theme-provider theme-2
                  [:> component]]])
        (let [root (sel1 "#theme-provider-test-root")]
          (is (= "foo" (.. root -dataset -foo)))
          (is (= "bar" (.. root -dataset -bar))))))))
