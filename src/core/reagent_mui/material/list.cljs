(ns reagent-mui.material.list
  "Imports @mui/material/List as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/list/ ."
  (:refer-clojure :exclude [list])
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/List" :as MuiList]))

(def list (adapt-react-class (.-default MuiList) "mui-list"))
