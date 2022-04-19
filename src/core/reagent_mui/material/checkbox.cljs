(ns reagent-mui.material.checkbox
  "Imports @mui/material/Checkbox as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/checkbox/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Checkbox" :as MuiCheckbox]))

(def checkbox (adapt-react-class (.-default MuiCheckbox) "mui-checkbox"))
