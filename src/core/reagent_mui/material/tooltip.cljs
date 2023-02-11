(ns reagent-mui.material.tooltip
  "Imports @mui/material/Tooltip as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/tooltip/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Tooltip" :as MuiTooltip]))

(def tooltip (r/adapt-react-class (.-default MuiTooltip)))
