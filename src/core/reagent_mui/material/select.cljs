(ns reagent-mui.material.select
  "Imports @mui/material/Select as a Reagent component.
   Original documentation is at https://mui.com/api/select/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Select" :as MuiSelect]))

(def select (adapt-react-class (.-default MuiSelect) "mui-select"))
