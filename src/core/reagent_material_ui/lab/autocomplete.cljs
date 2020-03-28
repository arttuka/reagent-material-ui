(ns reagent-material-ui.lab.autocomplete
  "Imports @material-ui/lab/Autocomplete as a Reagent component.
   Original documentation is at https://material-ui.com/api/autocomplete/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/Autocomplete" :as Autocomplete]))

(def autocomplete (adapt-react-class (or (.-default Autocomplete) (.-Autocomplete Autocomplete)) "mui-autocomplete"))
