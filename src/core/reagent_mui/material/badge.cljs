(ns reagent-mui.material.badge
  "Imports @mui/material/Badge as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/badge/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Badge" :as MuiBadge]))

(def badge (adapt-react-class (.-default MuiBadge) "mui-badge"))
