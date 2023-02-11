(ns reagent-mui.material.step
  "Imports @mui/material/Step as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/step/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Step" :as MuiStep]))

(def step (r/adapt-react-class (.-default MuiStep)))
