(ns reagent-mui.material.toolbar
  "Imports @mui/material/Toolbar as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/toolbar/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Toolbar" :as MuiToolbar]))

(def toolbar (r/adapt-react-class (.-default MuiToolbar)))
