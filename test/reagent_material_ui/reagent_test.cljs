(ns reagent-material-ui.reagent-test
  (:require [cljsjs.react]
            [cljsjs.react.dom]
            [cljs.test :refer-macros [deftest testing is use-fixtures]]
            [dommy.core :as dommy :refer-macros [sel1]]
            [reagent.core :as r]
            [reagent-material-ui.styles :refer [with-styles styled with-theme]]
            [reagent-material-ui.test-util :refer [unmount-fixture render]]))

(use-fixtures :each unmount-fixture)

(defn p [text]
  [:p text])

(deftest ratom-inside-wrapped-component-test
  (testing "reagent atom dereffed inside wrapped component"
    (let [a (r/atom 0)
          with-styles-component ((with-styles {})
                                 (fn []
                                   [:div#with-styles-root
                                    [p @a]]))
          styled-component (styled (fn []
                                     [:div#styled-root
                                      [p @a]])
                                   {})
          with-theme-component (with-theme (fn []
                                             [:div#with-theme-root
                                              [p @a]]))
          container (fn []
                      [:<>
                       [with-styles-component]
                       [styled-component]
                       [with-theme-component]])]
      (render [container])
      (let [with-styles-node (sel1 "#with-styles-root")
            styled-node (sel1 "#styled-root")
            with-theme-node (sel1 "#with-theme-root")]
        (is (= "0" (dommy/text with-styles-node)))
        (is (= "0" (dommy/text styled-node)))
        (is (= "0" (dommy/text with-theme-node)))
        (swap! a inc)
        (r/flush)
        (is (= "1" (dommy/text with-styles-node)))
        (is (= "1" (dommy/text styled-node)))
        (is (= "1" (dommy/text with-theme-node)))))))

(deftest ratom-inside-wrapped-children-test
  (testing "reagent atom dereffed in wrapped children"
    (let [a (r/atom 0)
          with-styles-component ((with-styles {})
                                 (fn [{:keys [children]}]
                                   [:div#with-styles-root
                                    children]))
          styled-component (styled (fn [{:keys [children]}]
                                     [:div#styled-root
                                      children])
                                   {})
          with-theme-component (with-theme (fn [{:keys [children]}]
                                             [:div#with-theme-root
                                              children]))
          container (fn []
                      [:<>
                       [with-styles-component [p @a]]
                       [styled-component [p @a]]
                       [with-theme-component [p @a]]])]
      (render [container])
      (let [with-styles-node (sel1 "#with-styles-root")
            styled-node (sel1 "#styled-root")
            with-theme-node (sel1 "#with-theme-root")]
        (is (= "0" (dommy/text with-styles-node)))
        (is (= "0" (dommy/text styled-node)))
        (is (= "0" (dommy/text with-theme-node)))
        (swap! a inc)
        (r/flush)
        (is (= "1" (dommy/text with-styles-node)))
        (is (= "1" (dommy/text styled-node)))
        (is (= "1" (dommy/text with-theme-node)))))))
