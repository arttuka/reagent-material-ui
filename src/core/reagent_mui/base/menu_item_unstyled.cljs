(ns reagent-mui.base.menu-item-unstyled
  "Imports @mui/base/MenuItemUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/menu-item-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/MenuItemUnstyled" :as MuiMenuItemUnstyled]))

(def menu-item-unstyled (adapt-react-class (.-default MuiMenuItemUnstyled) "mui-menu-item-unstyled"))
