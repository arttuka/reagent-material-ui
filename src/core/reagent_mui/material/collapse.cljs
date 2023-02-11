(ns reagent-mui.material.collapse
  "Imports @mui/material/Collapse as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/collapse/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Collapse" :as MuiCollapse]))

(def collapse (r/adapt-react-class (.-default MuiCollapse)))
