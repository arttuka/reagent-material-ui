(ns reagent-material-ui.core.create-filter-options
  "Imports @material-ui/core/Autocomplete/createFilterOptions as a Reagent component.
   Original documentation is at https://material-ui.com/api/create-filter-options/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class clj->js']]
            ["@material-ui/core/Autocomplete" :as MuiAutocomplete]))

(defn create-filter-options [config]
  ((.-createFilterOptions MuiAutocomplete) (clj->js' config)))
