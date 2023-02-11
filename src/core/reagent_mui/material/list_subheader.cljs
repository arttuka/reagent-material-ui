(ns reagent-mui.material.list-subheader
  "Imports @mui/material/ListSubheader as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/list-subheader/ ."
  (:require [reagent.core :as r]
            ["@mui/material/ListSubheader" :as MuiListSubheader]))

(def list-subheader (r/adapt-react-class (.-default MuiListSubheader)))
