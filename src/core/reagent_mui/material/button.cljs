(ns reagent-mui.material.button
  "Imports @mui/material/Button as a Reagent component.
   Original documentation is at https://mui.com/api/button/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Button" :as MuiButton]))

(def button (adapt-react-class (.-default MuiButton) "mui-button"))
