(ns reagent-material-ui.core.step
  "Imports @material-ui/core/Step as a Reagent component.
   Original documentation is at https://material-ui.com/api/step/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Step" :as MuiStep]))

(def step (adapt-react-class (.-default MuiStep) "mui-step"))
