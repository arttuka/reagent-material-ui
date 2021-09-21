(ns reagent-mui.material.tooltip
  "Imports @mui/material/Tooltip as a Reagent component.
   Original documentation is at https://mui.com/api/tooltip/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Tooltip" :as MuiTooltip]))

(def tooltip (adapt-react-class (.-default MuiTooltip) "mui-tooltip"))
