(ns reagent-material-ui.test-util
  (:require [reagent.core :as r]
            [dommy.core :refer-macros [sel1] :refer [create-element set-attr!]]))

(def render-target-id "reagent-material-ui-render-target")

(defn render-target []
  (if-let [target (sel1 (str \# render-target-id))]
    target
    (let [elem (doto (create-element "div")
                 (set-attr! "id" render-target-id))]
      (.append (sel1 "body") elem)
      elem)))

(defn render [component]
  (r/render component (render-target)))

(defn unmount []
  (some-> (sel1 (str \# render-target-id))
          (r/unmount-component-at-node)))

(def unmount-fixture {:after unmount})
