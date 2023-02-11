(ns reagent-mui.material.drawer
  "Imports @mui/material/Drawer as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/drawer/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Drawer" :as MuiDrawer]))

(def drawer (r/adapt-react-class (.-default MuiDrawer)))
