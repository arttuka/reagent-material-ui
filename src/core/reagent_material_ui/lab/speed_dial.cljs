(ns reagent-material-ui.lab.speed-dial
  "Imports @material-ui/lab/SpeedDial as a Reagent component.
   Original documentation is at https://material-ui.com/api/speed-dial/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/SpeedDial" :as MuiSpeedDial]))

(def speed-dial (adapt-react-class (.-default MuiSpeedDial) "mui-speed-dial"))
