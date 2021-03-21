(ns reagent-material-ui.core.speed-dial
  "Imports @material-ui/core/SpeedDial as a Reagent component.
   Original documentation is at https://material-ui.com/api/speed-dial/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/SpeedDial" :as MuiSpeedDial]))

(def speed-dial (adapt-react-class (.-default MuiSpeedDial) "mui-speed-dial"))
