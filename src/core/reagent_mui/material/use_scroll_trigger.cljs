(ns reagent-mui.material.use-scroll-trigger
  "Imports @mui/material/useScrollTrigger as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/material-ui/api/use-scroll-trigger/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/material/useScrollTrigger" :as MuiuseScrollTrigger]))

(def use-scroll-trigger (wrap-js-function (.-default MuiuseScrollTrigger)))
