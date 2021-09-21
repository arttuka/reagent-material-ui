(ns reagent-mui.cljsjs-test
  (:require [react :as react]
            [cljs.test :refer-macros [deftest testing is use-fixtures]]
            [dommy.core :as dommy :refer-macros [sel sel1]]
            [reagent.core :as r]
            [reagent-mui.test-util :refer [unmount-fixture render render-target]]
            [reagent-mui.material.stack :refer [stack]]
            [reagent-mui.lab.timeline :refer [timeline]]
            [reagent-mui.lab.timeline-connector :refer [timeline-connector]]
            [reagent-mui.lab.timeline-content :refer [timeline-content]]
            [reagent-mui.lab.timeline-dot :refer [timeline-dot]]
            [reagent-mui.lab.timeline-item :refer [timeline-item]]
            [reagent-mui.lab.timeline-separator :refer [timeline-separator]]
            [reagent-mui.styles :refer [styled]]))

(deftest cljsjs-test
  (testing "build succeeds with CLJSJS sources"
    (let [component (fn [{:keys [class-name children]}]
                      [:div.item {:class class-name}
                       children])
          item (styled component
                       {:color     "rgb(255, 0, 0)"
                        :font-size 20})]
      (render [stack {:direction :column}
               [item "Foo"]
               [item "Bar"]
               [item "Baz"]
               [timeline
                [timeline-item
                 [timeline-separator
                  [timeline-dot]
                  [timeline-connector]]
                 [timeline-content "Kikka"]]
                [timeline-item
                 [timeline-separator
                  [timeline-dot]]
                 [timeline-content "Kukka"]]]]))
    (let [items (sel ".item")]
      (is (= 3 (count items)))
      (is (= ["Foo" "Bar" "Baz"] (map dommy/text items)))
      (is (= "rgb(255, 0, 0)" (dommy/style (first items) :color)))
      (is (= "20px" (dommy/style (first items) :font-size))))
    (let [timeline-items (sel ".MuiTimelineContent-root")]
      (is (= 2 (count timeline-items)))
      (is (= ["Kikka" "Kukka"] (map dommy/text timeline-items))))))
