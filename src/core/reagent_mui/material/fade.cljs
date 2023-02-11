(ns reagent-mui.material.fade
  "Imports @mui/material/Fade as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/fade/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Fade" :as MuiFade]))

(def fade (r/adapt-react-class (.-default MuiFade)))
