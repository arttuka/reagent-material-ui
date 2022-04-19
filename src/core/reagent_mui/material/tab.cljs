(ns reagent-mui.material.tab
  "Imports @mui/material/Tab as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/tab/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Tab" :as MuiTab]))

(def tab (adapt-react-class (.-default MuiTab) "mui-tab"))
