(ns reagent-material-ui.lab.speed-dial-icon
  "Imports @material-ui/lab/SpeedDialIcon as a Reagent component.
   Original documentation is at https://material-ui.com/api/speed-dial-icon/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/SpeedDialIcon" :as MuiSpeedDialIcon]))

(def speed-dial-icon (adapt-react-class (.-default MuiSpeedDialIcon) "mui-speed-dial-icon"))
