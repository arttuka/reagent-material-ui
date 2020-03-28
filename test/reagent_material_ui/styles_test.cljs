(ns reagent-material-ui.styles-test
  (:require [cljsjs.react]
            [cljsjs.react.dom]
            [cljs.test :refer-macros [deftest testing is use-fixtures]]
            [dommy.core :as dommy :refer-macros [sel1]]
            [reagent.core :as r]
            [reagent-material-ui.styles :refer [make-styles with-styles styled use-theme with-theme theme-provider]]
            [reagent-material-ui.test-util :refer [unmount-fixture unmount render]]))

(use-fixtures :each unmount-fixture)

(def theme-primary-color "rgb(63, 81, 181)")
(def theme-primary-color-hex "#3f51b5")
(def theme-secondary-color "rgb(245, 0, 87)")
(def theme-secondary-color-hex "#f50057")
(def custom-primary-color "rgb(0, 42, 255)")
(def custom-secondary-color "rgb(98, 99, 100)")
(def font-size "42px")
(def text-node "some text content")

(defn p [text]
  [:p text])

(def basic-styles {:root  {:font-size font-size
                           :color     custom-primary-color}
                   :child {:color custom-secondary-color}})

(def theme-level-fn (fn [theme]
                      {:root  {:font-size font-size
                               :color     (get-in theme [:palette :primary :main])}
                       :child {:color (get-in theme [:palette :secondary :main])}}))

(def prop-level-fn {:root  {:font-size (fn [props]
                                         (:font-size props))
                            :color     custom-primary-color}
                    :child {:color custom-secondary-color}})

(def advanced-styles (fn [theme]
                       {:root  (fn [props]
                                 {:font-size (:font-size props)
                                  :color     (get-in theme [:palette :primary :main])})
                        :child {:color (get-in theme [:palette :secondary :main])}}))

(defn run-make-styles-test [styles root-color child-color]
  (let [use-styles (make-styles styles)
        component (fn []
                    (let [classes (use-styles {:font-size font-size})]
                      (r/as-element
                       [:div#make-styles-test-root {:class (:root classes)}
                        [:div#make-styles-test-child {:class (:child classes)}]])))]
    (render [:> component])
    (let [root (sel1 "#make-styles-test-root")]
      (is (= font-size (dommy/style root :font-size)))
      (is (= root-color (dommy/style root :color))))
    (let [child (sel1 "#make-styles-test-child")]
      (is (= child-color (dommy/style child :color))))
    (unmount)))

(deftest make-styles-test
  (testing "make-styles"
    (testing "with basic styles"
      (run-make-styles-test basic-styles custom-primary-color custom-secondary-color))
    (testing "with theme level fn"
      (run-make-styles-test theme-level-fn theme-primary-color theme-secondary-color))
    (testing "with prop level fn"
      (run-make-styles-test prop-level-fn custom-primary-color custom-secondary-color))
    (testing "with advanced styles"
      (run-make-styles-test advanced-styles theme-primary-color theme-secondary-color))))

(defn run-with-styles-test [styles root-color child-color]
  (let [component (fn [{:keys [classes children]}]
                    [:div#with-styles-test-root {:class (:root classes)}
                     [:div#with-styles-test-child {:class (:child classes)}
                      children]])
        styled-component ((with-styles styles) component)]
    (render [styled-component {:font-size font-size}
             text-node])
    (let [root (sel1 "#with-styles-test-root")]
      (is (= font-size (dommy/style root :font-size)))
      (is (= root-color (dommy/style root :color))))
    (let [child (sel1 "#with-styles-test-child")]
      (is (= child-color (dommy/style child :color)))
      (is (= text-node (dommy/text child))))
    (unmount)))

(deftest with-styles-test
  (testing "with-styles"
    (testing "with basic styles"
      (run-with-styles-test basic-styles custom-primary-color custom-secondary-color))
    (testing "with theme level fn"
      (run-with-styles-test theme-level-fn theme-primary-color theme-secondary-color))
    (testing "with prop level fn"
      (run-with-styles-test prop-level-fn custom-primary-color custom-secondary-color))
    (testing "with advanced styles"
      (run-with-styles-test advanced-styles theme-primary-color theme-secondary-color))
    (testing "forwards ref to component"
      (let [ref (.createRef js/React)
            component (fn [props]
                        [:div#with-styles-test-root props])
            styled-component ((with-styles {}) component)]
        (render [styled-component {:ref ref}])
        (is (= "with-styles-test-root" (.-id (.-current ref))))))
    (testing "allows reagent components as children"
      (let [component (fn [{:keys [children]}]
                        [:div#with-styles-test-root
                         children])
            styled-component ((with-styles {}) component)]
        (render [styled-component
                 [p "Some text"]
                 [p "More text"]])
        (is (= "Some textMore text" (dommy/text (sel1 "#with-styles-test-root"))))))))

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
      (let [ref (.createRef js/React)
            component (fn [props]
                        [:div#styled-test-root props])
            styled-component (styled component {})]
        (render [styled-component {:ref ref}])
        (is (= "styled-test-root" (.-id (.-current ref))))))
    (testing "allows reagent components as children"
      (let [component (fn [{:keys [children]}]
                        [:div#styled-test-root
                         children])
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

(deftest with-theme-test
  (testing "with-theme"
    (testing "adds theme to component's props"
      (let [component (fn [{:keys [theme font-size children]}]
                        [:div#with-theme-test-root
                         {:data-primarycolor   (get-in theme [:palette :primary :main])
                          :data-secondarycolor (get-in theme [:palette :secondary :main])
                          :data-fontsize       font-size}
                         children])
            wrapped-component (with-theme component)]
        (render [wrapped-component {:font-size font-size}
                 text-node])
        (let [root (sel1 "#with-theme-test-root")]
          (is (= theme-primary-color-hex (.. root -dataset -primarycolor)))
          (is (= theme-secondary-color-hex (.. root -dataset -secondarycolor)))
          (is (= font-size (.. root -dataset -fontsize)))
          (is (= text-node (dommy/text root))))))
    (testing "forwards ref to component"
      (let [ref (.createRef js/React)
            component (fn [props]
                        [:div#with-theme-test-root props])
            wrapped-component (with-theme component)]
        (render [wrapped-component {:ref ref}])
        (is (= "with-theme-test-root" (.-id (.-current ref))))))
    (testing "allows reagent components as children"
      (let [component (fn [{:keys [children]}]
                        [:div#with-theme-test-root
                         children])
            wrapped-component (with-theme component)]
        (render [wrapped-component
                 [p "Some text"]
                 [p "More text"]])
        (is (= "Some textMore text" (dommy/text (sel1 "#with-theme-test-root"))))))))

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
