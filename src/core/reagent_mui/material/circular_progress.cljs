(ns reagent-mui.material.circular-progress
  "Imports @mui/material/CircularProgress as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/circular-progress/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/CircularProgress" :as MuiCircularProgress]))

(def circular-progress (adapt-react-class (.-default MuiCircularProgress) "mui-circular-progress"))
