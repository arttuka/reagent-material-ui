(ns reagent-mui.material.use-touch-ripple
  "Imports @mui/material/useTouchRipple as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/material-ui/api/use-touch-ripple/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/material/useTouchRipple" :as MuiuseTouchRipple]))

(def use-touch-ripple (wrap-js-function (.-default MuiuseTouchRipple)))
