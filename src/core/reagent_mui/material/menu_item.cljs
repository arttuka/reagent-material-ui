(ns reagent-mui.material.menu-item
  "Imports @mui/material/MenuItem as a Reagent component.
   Original documentation is at https://mui.com/api/menu-item/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/MenuItem" :as MuiMenuItem]))

(def menu-item (adapt-react-class (.-default MuiMenuItem) "mui-menu-item"))
