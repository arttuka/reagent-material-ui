(ns reagent-material-ui.core.badge
  "Imports @material-ui/core/Badge as a Reagent component.
   Original documentation is at https://material-ui.com/api/badge/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Badge" :as MuiBadge]))

(def badge (adapt-react-class (or (.-default MuiBadge) (.-Badge MuiBadge)) "mui-badge"))
