(ns reagent-mui.material.select
  "Imports @mui/material/Select as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/select/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Select" :as MuiSelect]))

(def select (r/adapt-react-class (.-default MuiSelect)))
