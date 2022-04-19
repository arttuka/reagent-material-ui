(ns reagent-mui.material.step
  "Imports @mui/material/Step as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/step/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Step" :as MuiStep]))

(def step (adapt-react-class (.-default MuiStep) "mui-step"))
