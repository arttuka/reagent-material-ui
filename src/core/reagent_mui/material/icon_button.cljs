(ns reagent-mui.material.icon-button
  "Imports @mui/material/IconButton as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/icon-button/ ."
  (:require [reagent.core :as r]
            ["@mui/material/IconButton" :as MuiIconButton]))

(def icon-button (r/adapt-react-class (.-default MuiIconButton)))
