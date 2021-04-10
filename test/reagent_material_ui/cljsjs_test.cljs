(ns reagent-material-ui.cljsjs-test
  (:require [react :as react]
            [cljs.test :refer-macros [deftest testing is use-fixtures]]
            [dommy.core :as dommy :refer-macros [sel sel1]]
            [reagent.core :as r]
            [reagent-material-ui.test-util :refer [unmount-fixture render render-target]]
            [reagent-material-ui.core.stack :refer [stack]]
            [reagent-material-ui.styles :refer [styled]]))

(deftest cljsjs-test
  (testing "build succeeds with CLJSJS sources"
    (let [item (styled (fn [{:keys [class-name children]}]
                         [:div.item {:class class-name}
                          children])
                       {:color     "rgb(255, 0, 0)"
                        :font-size 20})]
      (render [stack {:direction :column}
               [item "Foo"]
               [item "Bar"]
               [item "Baz"]]))
    (let [items (sel ".item")]
      (is (= 3 (count items)))
      (is (= ["Foo" "Bar" "Baz"] (map dommy/text items)))
      (is (= "rgb(255, 0, 0)" (dommy/style (first items) :color)))
      (is (= "20px" (dommy/style (first items) :font-size))))))
