(ns reagent-mui.core.badge-unstyled
  "Imports @mui/core/BadgeUnstyled as a Reagent component.
   Original documentation is at https://mui.com/api/badge-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/core/BadgeUnstyled" :as MuiBadgeUnstyled]))

(def badge-unstyled (adapt-react-class (.-default MuiBadgeUnstyled) "mui-badge-unstyled"))
