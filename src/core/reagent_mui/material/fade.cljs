(ns reagent-mui.material.fade
  "Imports @mui/material/Fade as a Reagent component.
   Original documentation is at https://mui.com/api/fade/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Fade" :as MuiFade]))

(def fade (adapt-react-class (.-default MuiFade) "mui-fade"))
