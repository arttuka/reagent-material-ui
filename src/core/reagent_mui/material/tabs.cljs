(ns reagent-mui.material.tabs
  "Imports @mui/material/Tabs as a Reagent component.
   Original documentation is at https://mui.com/api/tabs/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Tabs" :as MuiTabs]))

(def tabs (adapt-react-class (.-default MuiTabs) "mui-tabs"))
