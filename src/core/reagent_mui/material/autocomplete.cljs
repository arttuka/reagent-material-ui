(ns reagent-mui.material.autocomplete
  "Imports @mui/material/Autocomplete as a Reagent component.
   Original documentation is at https://mui.com/api/autocomplete/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Autocomplete" :as MuiAutocomplete]))

(def autocomplete (adapt-react-class (.-default MuiAutocomplete) "mui-autocomplete"))
