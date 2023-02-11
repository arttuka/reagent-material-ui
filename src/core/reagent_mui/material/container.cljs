(ns reagent-mui.material.container
  "Imports @mui/material/Container as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/container/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Container" :as MuiContainer]))

(def container (r/adapt-react-class (.-default MuiContainer)))
