(ns reagent-mui.material.tabs
  "Imports @mui/material/Tabs as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/tabs/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Tabs" :as MuiTabs]))

(def tabs (r/adapt-react-class (.-default MuiTabs)))
