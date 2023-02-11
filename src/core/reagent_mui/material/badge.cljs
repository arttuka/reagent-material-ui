(ns reagent-mui.material.badge
  "Imports @mui/material/Badge as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/badge/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Badge" :as MuiBadge]))

(def badge (r/adapt-react-class (.-default MuiBadge)))
