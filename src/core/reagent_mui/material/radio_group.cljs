(ns reagent-mui.material.radio-group
  "Imports @mui/material/RadioGroup as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/radio-group/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/RadioGroup" :as MuiRadioGroup]))

(def radio-group (adapt-react-class (.-default MuiRadioGroup) "mui-radio-group"))
