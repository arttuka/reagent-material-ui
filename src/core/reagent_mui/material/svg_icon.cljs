(ns reagent-mui.material.svg-icon
  "Imports @mui/material/SvgIcon as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/svg-icon/ ."
  (:require [reagent.core :as r]
            ["@mui/material/SvgIcon" :as MuiSvgIcon]))

(def svg-icon (r/adapt-react-class (.-default MuiSvgIcon)))
