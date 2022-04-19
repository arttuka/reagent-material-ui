(ns reagent-mui.material.divider
  "Imports @mui/material/Divider as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/divider/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Divider" :as MuiDivider]))

(def divider (adapt-react-class (.-default MuiDivider) "mui-divider"))
