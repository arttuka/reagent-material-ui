(ns reagent-material-ui.styles-test
  (:require [react :as react]
            [cljs.test :refer-macros [deftest testing is use-fixtures]]
            [dommy.core :as dommy :refer-macros [sel1]]
            [reagent.core :as r]
            [reagent-material-ui.styles :refer [styled use-theme theme-provider]]
            [reagent-material-ui.test-util :refer [unmount-fixture unmount render]]))

(use-fixtures :each unmount-fixture)

(def theme-primary-color "rgb(25, 118, 210)")
(def theme-primary-color-hex "#1976d2")
(def theme-secondary-color-hex "#9c27b0")
(def custom-primary-color "rgb(0, 42, 255)")
(def font-size "42px")
(def text-node "some text content")

(defn p [text]
  [:p text])

(defn run-styled-test [styles color]
  (let [component (fn [{:keys [class-name children extra-param]}]
                    [:div#styled-test-root {:class           class-name
                                            :data-extraparam extra-param}
                     children])
        styled-component (styled component styles)]
    (render [styled-component {:font-size   "42px"
                               :extra-param "foo"}
             text-node])
    (let [root (sel1 "#styled-test-root")]
      (is (= font-size (dommy/style root :font-size)))
      (is (= color (dommy/style root :color)))
      (is (= text-node (dommy/text root)))
      (is (= "foo" (.. root -dataset -extraparam))))
    (unmount)))

(deftest styled-test
  (testing "styled"
    (testing "with basic styles"
      (run-styled-test {:font-size font-size
                        :color     custom-primary-color}
                       custom-primary-color))
    (testing "with function styles"
      (run-styled-test (fn [props]
                         {:font-size (:font-size props)
                          :color     (get-in props [:theme :palette :primary :main])})
                       theme-primary-color))
    (testing "forwards ref to component"
      (let [ref (react/createRef)
            component (fn [props]
                        [:div#styled-test-root props])
            styled-component (styled component {})]
        (render [styled-component {:ref ref}])
        (is (= "styled-test-root" (.-id (.-current ref))))))
    (testing "allows reagent components as children"
      (let [component (fn [{:keys [children]}]
                        (into [:div#styled-test-root]
                              children))
            styled-component (styled component {})]
        (render [styled-component
                 [p "Some text"]
                 [p "More text"]])
        (is (= "Some textMore text" (dommy/text (sel1 "#styled-test-root"))))))))

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
        (is (= theme-primary-color-hex (.. root -dataset -primarycolor)))
        (is (= theme-secondary-color-hex (.. root -dataset -secondarycolor)))))))

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
