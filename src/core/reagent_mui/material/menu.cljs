(ns reagent-mui.material.menu
  "Imports @mui/material/Menu as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/menu/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Menu" :as MuiMenu]))

(def menu (r/adapt-react-class (.-default MuiMenu)))
