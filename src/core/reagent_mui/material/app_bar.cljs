(ns reagent-mui.material.app-bar
  "Imports @mui/material/AppBar as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/app-bar/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/AppBar" :as MuiAppBar]))

(def app-bar (adapt-react-class (.-default MuiAppBar) "mui-app-bar"))
