(ns reagent-mui.material.speed-dial-action
  "Imports @mui/material/SpeedDialAction as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/speed-dial-action/ ."
  (:require [reagent.core :as r]
            ["@mui/material/SpeedDialAction" :as MuiSpeedDialAction]))

(def speed-dial-action (r/adapt-react-class (.-default MuiSpeedDialAction)))
