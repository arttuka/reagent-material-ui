(ns reagent-material-ui.core.use-media-query
  "Imports @material-ui/core/useMediaQuery as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://material-ui.com/api/use-media-query/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/core/useMediaQuery" :as MuiuseMediaQuery]))

(def use-media-query (wrap-js-function (.-default MuiuseMediaQuery)))
