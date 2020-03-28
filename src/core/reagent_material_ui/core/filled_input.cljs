(ns reagent-material-ui.core.filled-input
  "Imports @material-ui/core/FilledInput as a Reagent component.
   Original documentation is at https://material-ui.com/api/filled-input/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/FilledInput" :as FilledInput]))

(def filled-input (adapt-react-class (or (.-default FilledInput) (.-FilledInput FilledInput)) "mui-filled-input"))
