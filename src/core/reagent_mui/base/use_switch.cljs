(ns reagent-mui.base.use-switch
  "Imports @mui/base/useSwitch as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/base/api/use-switch/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/useSwitch" :as MuiuseSwitch]))

(def use-switch (wrap-js-function (.-default MuiuseSwitch)))
