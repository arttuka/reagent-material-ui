(ns reagent-mui.material.list-subheader
  "Imports @mui/material/ListSubheader as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/list-subheader/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/ListSubheader" :as MuiListSubheader]))

(def list-subheader (adapt-react-class (.-default MuiListSubheader) "mui-list-subheader"))
