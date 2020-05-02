(ns reagent-material-ui.lab.speed-dial-action
  "Imports @material-ui/lab/SpeedDialAction as a Reagent component.
   Original documentation is at https://material-ui.com/api/speed-dial-action/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/SpeedDialAction" :as MuiSpeedDialAction]))

(def speed-dial-action (adapt-react-class (or (.-default MuiSpeedDialAction) (.-SpeedDialAction MuiSpeedDialAction)) "mui-speed-dial-action"))
