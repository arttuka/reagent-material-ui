(ns reagent-mui.material.menu-item
  "Imports @mui/material/MenuItem as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/menu-item/ ."
  (:require [reagent.core :as r]
            ["@mui/material/MenuItem" :as MuiMenuItem]))

(def menu-item (r/adapt-react-class (.-default MuiMenuItem)))
