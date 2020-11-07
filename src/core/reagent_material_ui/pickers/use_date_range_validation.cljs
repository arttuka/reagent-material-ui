(ns reagent-material-ui.pickers.use-date-range-validation
  "Imports @material-ui/pickers/useDateRangeValidation as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/useDateRangeValidation/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def use-date-range-validation (adapt-react-class (.-useDateRangeValidation pickers) "mui-use-date-range-validation"))
