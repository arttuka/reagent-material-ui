(ns reagent-material-ui.unstyled.use-switch
  "Imports @material-ui/unstyled/SwitchUnstyled/useSwitch as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://material-ui.com/api/use-switch/ ."
  (:require [reagent-material-ui.util :refer [wrap-js-function]]
            ["@material-ui/unstyled/SwitchUnstyled" :as MuiSwitchUnstyled]))

(def use-switch (wrap-js-function (.-useSwitch MuiSwitchUnstyled)))
