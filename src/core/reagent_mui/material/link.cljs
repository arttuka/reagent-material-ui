(ns reagent-mui.material.link
  "Imports @mui/material/Link as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/link/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Link" :as MuiLink]))

(def link (r/adapt-react-class (.-default MuiLink)))
