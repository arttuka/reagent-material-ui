(ns reagent-mui.material.create-filter-options
  "Imports @mui/material/Autocomplete/createFilterOptions as a Reagent component.
   Original documentation is at https://mui.com/material-ui/react-autocomplete/#createfilteroptions-config-filteroptions ."
  (:require [reagent-mui.util :refer [adapt-react-class clj->js']]
            ["@mui/material/Autocomplete" :as MuiAutocomplete]))

(defn create-filter-options [config]
  ((.-createFilterOptions MuiAutocomplete) (clj->js' config)))
