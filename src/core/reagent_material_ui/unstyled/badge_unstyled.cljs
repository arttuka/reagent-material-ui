(ns reagent-material-ui.unstyled.badge-unstyled
  "Imports @material-ui/unstyled/BadgeUnstyled as a Reagent component.
   Original documentation is at https://material-ui.com/api/badge-unstyled/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/unstyled/BadgeUnstyled" :as MuiBadgeUnstyled]))

(def badge-unstyled (adapt-react-class (.-default MuiBadgeUnstyled) "mui-badge-unstyled"))
