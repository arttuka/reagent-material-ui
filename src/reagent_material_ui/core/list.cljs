(ns reagent-material-ui.core.list
  "Imports @material-ui/core/List as a Reagent component.
   Original documentation is at https://material-ui.com/api/list/ ."
  (:refer-clojure :exclude [list])
  (:require [reagent.core :as r]
            [material-ui]))

(def list (r/adapt-react-class (.-List js/MaterialUI)))
