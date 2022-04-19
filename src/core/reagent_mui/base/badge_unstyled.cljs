(ns reagent-mui.base.badge-unstyled
  "Imports @mui/base/BadgeUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/badge-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/BadgeUnstyled" :as MuiBadgeUnstyled]))

(def badge-unstyled (adapt-react-class (.-default MuiBadgeUnstyled) "mui-badge-unstyled"))
