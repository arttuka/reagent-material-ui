(ns reagent-mui.material.tab
  "Imports @mui/material/Tab as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/tab/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Tab" :as MuiTab]))

(def tab (r/adapt-react-class (.-default MuiTab)))
