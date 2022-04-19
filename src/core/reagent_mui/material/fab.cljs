(ns reagent-mui.material.fab
  "Imports @mui/material/Fab as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/fab/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Fab" :as MuiFab]))

(def fab (adapt-react-class (.-default MuiFab) "mui-fab"))
