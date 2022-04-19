(ns reagent-mui.material.menu
  "Imports @mui/material/Menu as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/menu/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Menu" :as MuiMenu]))

(def menu (adapt-react-class (.-default MuiMenu) "mui-menu"))
