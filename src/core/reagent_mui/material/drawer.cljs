(ns reagent-mui.material.drawer
  "Imports @mui/material/Drawer as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/drawer/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Drawer" :as MuiDrawer]))

(def drawer (adapt-react-class (.-default MuiDrawer) "mui-drawer"))
