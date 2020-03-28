(ns reagent-material-ui.core.outlined-input
  "Imports @material-ui/core/OutlinedInput as a Reagent component.
   Original documentation is at https://material-ui.com/api/outlined-input/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/OutlinedInput" :as OutlinedInput]))

(def outlined-input (adapt-react-class (or (.-default OutlinedInput) (.-OutlinedInput OutlinedInput)) "mui-outlined-input"))
