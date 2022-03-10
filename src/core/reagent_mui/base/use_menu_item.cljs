(ns reagent-mui.base.use-menu-item
  "Imports @mui/base/MenuItemUnstyled/useMenuItem as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/api/use-menu-item/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/MenuItemUnstyled" :as MuiMenuItemUnstyled]))

(def use-menu-item (wrap-js-function (.-useMenuItem MuiMenuItemUnstyled)))
