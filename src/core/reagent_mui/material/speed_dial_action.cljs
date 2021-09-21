(ns reagent-mui.material.speed-dial-action
  "Imports @mui/material/SpeedDialAction as a Reagent component.
   Original documentation is at https://mui.com/api/speed-dial-action/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/SpeedDialAction" :as MuiSpeedDialAction]))

(def speed-dial-action (adapt-react-class (.-default MuiSpeedDialAction) "mui-speed-dial-action"))
