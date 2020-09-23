(ns reagent-material-ui.core.autocomplete
  "Imports @material-ui/core/Autocomplete as a Reagent component.
   Original documentation is at https://material-ui.com/api/autocomplete/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Autocomplete" :as MuiAutocomplete]))

(def autocomplete (adapt-react-class (or (.-default MuiAutocomplete) (.-Autocomplete MuiAutocomplete)) "mui-autocomplete"))
