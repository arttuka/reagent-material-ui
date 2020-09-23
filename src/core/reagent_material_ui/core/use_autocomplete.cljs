(ns reagent-material-ui.core.use-autocomplete
  "Imports @material-ui/core/useAutocomplete as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://material-ui.com/api/use-autocomplete/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/core/useAutocomplete" :as MuiuseAutocomplete]))

(def use-autocomplete (wrap-js-function (or (.-default MuiuseAutocomplete) (.-useAutocomplete MuiuseAutocomplete))))
