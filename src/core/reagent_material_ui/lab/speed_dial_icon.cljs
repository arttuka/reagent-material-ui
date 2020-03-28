(ns reagent-material-ui.lab.speed-dial-icon
  "Imports @material-ui/lab/SpeedDialIcon as a Reagent component.
   Original documentation is at https://material-ui.com/api/speed-dial-icon/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/SpeedDialIcon" :as SpeedDialIcon]))

(def speed-dial-icon (adapt-react-class (or (.-default SpeedDialIcon) (.-SpeedDialIcon SpeedDialIcon)) "mui-speed-dial-icon"))
