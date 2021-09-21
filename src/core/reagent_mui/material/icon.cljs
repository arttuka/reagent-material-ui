(ns reagent-mui.material.icon
  "Imports @mui/material/Icon as a Reagent component.
   Original documentation is at https://mui.com/api/icon/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Icon" :as MuiIcon]))

(def icon (adapt-react-class (.-default MuiIcon) "mui-icon"))
