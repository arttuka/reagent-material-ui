(ns reagent-mui.material.use-autocomplete
  "Imports @mui/material/useAutocomplete as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/material-ui/api/use-autocomplete/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/material/useAutocomplete" :as MuiuseAutocomplete]))

(def use-autocomplete (wrap-js-function (.-default MuiuseAutocomplete)))
