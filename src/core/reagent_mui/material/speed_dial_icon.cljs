(ns reagent-mui.material.speed-dial-icon
  "Imports @mui/material/SpeedDialIcon as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/speed-dial-icon/ ."
  (:require [reagent.core :as r]
            ["@mui/material/SpeedDialIcon" :as MuiSpeedDialIcon]))

(def speed-dial-icon (r/adapt-react-class (.-default MuiSpeedDialIcon)))
