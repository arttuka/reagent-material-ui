(ns reagent-mui.material.container
  "Imports @mui/material/Container as a Reagent component.
   Original documentation is at https://mui.com/api/container/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Container" :as MuiContainer]))

(def container (adapt-react-class (.-default MuiContainer) "mui-container"))
