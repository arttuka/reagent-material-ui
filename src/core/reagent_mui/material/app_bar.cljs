(ns reagent-mui.material.app-bar
  "Imports @mui/material/AppBar as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/app-bar/ ."
  (:require [reagent.core :as r]
            ["@mui/material/AppBar" :as MuiAppBar]))

(def app-bar (r/adapt-react-class (.-default MuiAppBar)))
