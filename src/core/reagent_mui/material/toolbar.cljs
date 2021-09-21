(ns reagent-mui.material.toolbar
  "Imports @mui/material/Toolbar as a Reagent component.
   Original documentation is at https://mui.com/api/toolbar/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Toolbar" :as MuiToolbar]))

(def toolbar (adapt-react-class (.-default MuiToolbar) "mui-toolbar"))
