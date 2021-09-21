(ns reagent-mui.material.grow
  "Imports @mui/material/Grow as a Reagent component.
   Original documentation is at https://mui.com/api/grow/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Grow" :as MuiGrow]))

(def grow (adapt-react-class (.-default MuiGrow) "mui-grow"))
