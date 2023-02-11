(ns reagent-mui.material.icon
  "Imports @mui/material/Icon as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/icon/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Icon" :as MuiIcon]))

(def icon (r/adapt-react-class (.-default MuiIcon)))
