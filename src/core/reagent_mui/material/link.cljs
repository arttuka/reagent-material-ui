(ns reagent-mui.material.link
  "Imports @mui/material/Link as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/link/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Link" :as MuiLink]))

(def link (adapt-react-class (.-default MuiLink) "mui-link"))
