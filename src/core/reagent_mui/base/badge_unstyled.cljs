(ns reagent-mui.base.badge-unstyled
  "Imports @mui/base/BadgeUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/badge-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/BadgeUnstyled" :as MuiBadgeUnstyled]))

(def badge-unstyled (r/adapt-react-class (.-default MuiBadgeUnstyled)))
