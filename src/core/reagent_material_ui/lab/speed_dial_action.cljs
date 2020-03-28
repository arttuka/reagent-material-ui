(ns reagent-material-ui.lab.speed-dial-action
  "Imports @material-ui/lab/SpeedDialAction as a Reagent component.
   Original documentation is at https://material-ui.com/api/speed-dial-action/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/SpeedDialAction" :as SpeedDialAction]))

(def speed-dial-action (adapt-react-class (or (.-default SpeedDialAction) (.-SpeedDialAction SpeedDialAction)) "mui-speed-dial-action"))
