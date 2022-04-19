(ns reagent-mui.base.menu-unstyled
  "Imports @mui/base/MenuUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/menu-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/MenuUnstyled" :as MuiMenuUnstyled]))

(def menu-unstyled (adapt-react-class (.-default MuiMenuUnstyled) "mui-menu-unstyled"))
