(ns reagent-mui.base.use-listbox
  "Imports @mui/base/useListbox as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/base/api/use-listbox/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/useListbox" :as MuiuseListbox]))

(def use-listbox (wrap-js-function (.-default MuiuseListbox)))
