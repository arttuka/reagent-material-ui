(ns reagent-mui.material.menu-list
  "Imports @mui/material/MenuList as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/menu-list/ ."
  (:require [reagent.core :as r]
            ["@mui/material/MenuList" :as MuiMenuList]))

(def menu-list (r/adapt-react-class (.-default MuiMenuList)))
