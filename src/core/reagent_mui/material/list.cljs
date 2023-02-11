(ns reagent-mui.material.list
  "Imports @mui/material/List as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/list/ ."
  (:refer-clojure :exclude [list])
  (:require [reagent.core :as r]
            ["@mui/material/List" :as MuiList]))

(def list (r/adapt-react-class (.-default MuiList)))
