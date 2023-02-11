(ns reagent-mui.material.autocomplete
  "Imports @mui/material/Autocomplete as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/autocomplete/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Autocomplete" :as MuiAutocomplete]))

(def autocomplete (r/adapt-react-class (.-default MuiAutocomplete)))
