(ns reagent-mui.material.svg-icon
  "Imports @mui/material/SvgIcon as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/svg-icon/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/SvgIcon" :as MuiSvgIcon]))

(def svg-icon (adapt-react-class (.-default MuiSvgIcon) "mui-svg-icon"))
