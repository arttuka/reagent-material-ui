(ns reagent-mui.material.button
  "Imports @mui/material/Button as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/button/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Button" :as MuiButton]))

(def button (r/adapt-react-class (.-default MuiButton)))
