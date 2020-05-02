(ns reagent-material-ui.core.menu-list
  "Imports @material-ui/core/MenuList as a Reagent component.
   Original documentation is at https://material-ui.com/api/menu-list/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/MenuList" :as MuiMenuList]))

(def menu-list (adapt-react-class (or (.-default MuiMenuList) (.-MenuList MuiMenuList)) "mui-menu-list"))
