(ns reagent-mui.material.toggle-button
  "Imports @mui/material/ToggleButton as a Reagent component.
   Original documentation is at https://mui.com/api/toggle-button/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/ToggleButton" :as MuiToggleButton]))

(def toggle-button (adapt-react-class (.-default MuiToggleButton) "mui-toggle-button"))
