(ns reagent-mui.material.speed-dial
  "Imports @mui/material/SpeedDial as a Reagent component.
   Original documentation is at https://mui.com/api/speed-dial/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/SpeedDial" :as MuiSpeedDial]))

(def speed-dial (adapt-react-class (.-default MuiSpeedDial) "mui-speed-dial"))
