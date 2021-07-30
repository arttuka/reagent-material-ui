(ns reagent-material-ui.core.use-touch-ripple
  "Imports @material-ui/core/useTouchRipple as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://material-ui.com/api/use-touch-ripple/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/core/useTouchRipple" :as MuiuseTouchRipple]))

(def use-touch-ripple (wrap-js-function (.-default MuiuseTouchRipple)))
