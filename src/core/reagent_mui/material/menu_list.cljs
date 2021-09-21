(ns reagent-mui.material.menu-list
  "Imports @mui/material/MenuList as a Reagent component.
   Original documentation is at https://mui.com/api/menu-list/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/MenuList" :as MuiMenuList]))

(def menu-list (adapt-react-class (.-default MuiMenuList) "mui-menu-list"))
