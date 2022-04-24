(ns reagent-mui.base.use-menu
  "Imports @mui/base/MenuUnstyled/useMenu as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/base/api/use-menu/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/MenuUnstyled" :as MuiMenuUnstyled]))

(def use-menu (wrap-js-function MuiMenuUnstyled/useMenu))
