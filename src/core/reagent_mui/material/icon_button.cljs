(ns reagent-mui.material.icon-button
  "Imports @mui/material/IconButton as a Reagent component.
   Original documentation is at https://mui.com/api/icon-button/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/IconButton" :as MuiIconButton]))

(def icon-button (adapt-react-class (.-default MuiIconButton) "mui-icon-button"))
