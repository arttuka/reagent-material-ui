(ns reagent-material-ui.lab.create-filter-options
  "Imports @material-ui/lab/Autocomplete/createFilterOptions as a Reagent component.
   Original documentation is at https://material-ui.com/api/create-filter-options/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class clj->js']]
            ["@material-ui/lab/Autocomplete" :as Autocomplete]))

(defn create-filter-options [config]
  ((.-createFilterOptions Autocomplete) (clj->js' config)))
