(ns reagent-mui.material.speed-dial
  "Imports @mui/material/SpeedDial as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/speed-dial/ ."
  (:require [reagent.core :as r]
            ["@mui/material/SpeedDial" :as MuiSpeedDial]))

(def speed-dial (r/adapt-react-class (.-default MuiSpeedDial)))
