(ns reagent-mui.material.collapse
  "Imports @mui/material/Collapse as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/collapse/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Collapse" :as MuiCollapse]))

(def collapse (adapt-react-class (.-default MuiCollapse) "mui-collapse"))
