(ns reagent-mui.material.speed-dial-icon
  "Imports @mui/material/SpeedDialIcon as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/speed-dial-icon/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/SpeedDialIcon" :as MuiSpeedDialIcon]))

(def speed-dial-icon (adapt-react-class (.-default MuiSpeedDialIcon) "mui-speed-dial-icon"))
