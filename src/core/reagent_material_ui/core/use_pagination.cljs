(ns reagent-material-ui.core.use-pagination
  "Imports @material-ui/core/usePagination as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://material-ui.com/api/use-pagination/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/core/usePagination" :as MuiusePagination]))

(def use-pagination (wrap-js-function (.-default MuiusePagination)))
