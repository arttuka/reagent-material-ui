(ns reagent-mui.material.divider
  "Imports @mui/material/Divider as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/divider/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Divider" :as MuiDivider]))

(def divider (r/adapt-react-class (.-default MuiDivider)))
