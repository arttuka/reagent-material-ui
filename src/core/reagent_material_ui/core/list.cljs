(ns reagent-material-ui.core.list
  "Imports @material-ui/core/List as a Reagent component.
   Original documentation is at https://material-ui.com/api/list/ ."
  (:refer-clojure :exclude [list])
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/List" :as MuiList]))

(def list (adapt-react-class (.-default MuiList) "mui-list"))
