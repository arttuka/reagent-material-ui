(ns reagent-mui.material.alert
  "Imports @mui/material/Alert as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/alert/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Alert" :as MuiAlert]))

(def alert (adapt-react-class (.-default MuiAlert) "mui-alert"))
