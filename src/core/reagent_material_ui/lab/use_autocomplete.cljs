(ns reagent-material-ui.lab.use-autocomplete
  "Imports @material-ui/lab/useAutocomplete as a React hook.
   Note: React hooks can't be used in regular Reagent components: http://reagent-project.github.io/docs/master/ReactFeatures.html#hooks
   Original documentation is at https://material-ui.com/api/use-autocomplete/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/lab/useAutocomplete" :as useAutocomplete]))

(def use-autocomplete (wrap-js-function (or (.-default useAutocomplete) (.-useAutocomplete useAutocomplete))))
