(ns reagent-mui.base.use-badge
  "Imports @mui/base/BadgeUnstyled/useBadge as a React hook.
   Note: React hooks can't be used in regular Reagent components: https://cljdoc.org/d/reagent/reagent/1.0.0-alpha2/doc/tutorials/react-features#hooks
   Original documentation is at https://mui.com/api/use-badge/ ."
  (:require [reagent-mui.util :refer [wrap-js-function]]
            ["@mui/base/BadgeUnstyled" :as MuiBadgeUnstyled]))

(def use-badge (wrap-js-function (.-useBadge MuiBadgeUnstyled)))
