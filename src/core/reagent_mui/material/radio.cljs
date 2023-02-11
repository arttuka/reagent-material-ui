(ns reagent-mui.material.radio
  "Imports @mui/material/Radio as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/radio/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Radio" :as MuiRadio]))

(def radio (r/adapt-react-class (.-default MuiRadio)))
