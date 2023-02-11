(ns reagent-mui.material.fab
  "Imports @mui/material/Fab as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/fab/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Fab" :as MuiFab]))

(def fab (r/adapt-react-class (.-default MuiFab)))
