(ns reagent-material-ui.core.speed-dial-action
  "Imports @material-ui/core/SpeedDialAction as a Reagent component.
   Original documentation is at https://material-ui.com/api/speed-dial-action/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/SpeedDialAction" :as MuiSpeedDialAction]))

(def speed-dial-action (adapt-react-class (or (.-default MuiSpeedDialAction) (.-SpeedDialAction MuiSpeedDialAction)) "mui-speed-dial-action"))
