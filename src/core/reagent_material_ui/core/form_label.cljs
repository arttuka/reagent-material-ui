(ns reagent-material-ui.core.form-label
  "Imports @material-ui/core/FormLabel as a Reagent component.
   Original documentation is at https://material-ui.com/api/form-label/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/FormLabel" :as MuiFormLabel]))

(def form-label (adapt-react-class (or (.-default MuiFormLabel) (.-FormLabel MuiFormLabel)) "mui-form-label"))
