(ns reagent-mui.material.toggle-button
  "Imports @mui/material/ToggleButton as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/toggle-button/ ."
  (:require [reagent.core :as r]
            ["@mui/material/ToggleButton" :as MuiToggleButton]))

(def toggle-button (r/adapt-react-class (.-default MuiToggleButton)))
