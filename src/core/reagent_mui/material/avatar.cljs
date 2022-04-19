(ns reagent-mui.material.avatar
  "Imports @mui/material/Avatar as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/avatar/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Avatar" :as MuiAvatar]))

(def avatar (adapt-react-class (.-default MuiAvatar) "mui-avatar"))
