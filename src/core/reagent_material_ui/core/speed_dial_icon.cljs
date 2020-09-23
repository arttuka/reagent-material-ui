(ns reagent-material-ui.core.speed-dial-icon
  "Imports @material-ui/core/SpeedDialIcon as a Reagent component.
   Original documentation is at https://material-ui.com/api/speed-dial-icon/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/SpeedDialIcon" :as MuiSpeedDialIcon]))

(def speed-dial-icon (adapt-react-class (or (.-default MuiSpeedDialIcon) (.-SpeedDialIcon MuiSpeedDialIcon)) "mui-speed-dial-icon"))
