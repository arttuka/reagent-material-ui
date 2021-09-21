(ns reagent-mui.material.box
  "Imports @mui/material/Box as a Reagent component.
   Original documentation is at https://mui.com/api/box/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Box" :as MuiBox]))

(def box (adapt-react-class (.-default MuiBox) "mui-box"))
