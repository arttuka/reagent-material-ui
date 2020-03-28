(ns reagent-material-ui.core.checkbox
  "Imports @material-ui/core/Checkbox as a Reagent component.
   Original documentation is at https://material-ui.com/api/checkbox/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Checkbox" :as Checkbox]))

(def checkbox (adapt-react-class (or (.-default Checkbox) (.-Checkbox Checkbox)) "mui-checkbox"))
