(ns reagent-material-ui.core.step
  "Imports @material-ui/core/Step as a Reagent component.
   Original documentation is at https://material-ui.com/api/step/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Step" :as Step]))

(def step (adapt-react-class (or (.-default Step) (.-Step Step)) "mui-step"))
