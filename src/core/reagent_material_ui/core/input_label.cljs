(ns reagent-material-ui.core.input-label
  "Imports @material-ui/core/InputLabel as a Reagent component.
   Original documentation is at https://material-ui.com/api/input-label/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/InputLabel" :as MuiInputLabel]))

(def input-label (adapt-react-class (.-default MuiInputLabel) "mui-input-label"))
