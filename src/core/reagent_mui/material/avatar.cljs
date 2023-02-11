(ns reagent-mui.material.avatar
  "Imports @mui/material/Avatar as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/avatar/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Avatar" :as MuiAvatar]))

(def avatar (r/adapt-react-class (.-default MuiAvatar)))
