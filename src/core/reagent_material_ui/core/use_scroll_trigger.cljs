(ns reagent-material-ui.core.use-scroll-trigger
  "Imports @material-ui/core/useScrollTrigger as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://material-ui.com/api/use-scroll-trigger/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/core/useScrollTrigger" :as MuiuseScrollTrigger]))

(def use-scroll-trigger (wrap-js-function (.-default MuiuseScrollTrigger)))
