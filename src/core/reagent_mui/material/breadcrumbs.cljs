(ns reagent-mui.material.breadcrumbs
  "Imports @mui/material/Breadcrumbs as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/breadcrumbs/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Breadcrumbs" :as MuiBreadcrumbs]))

(def breadcrumbs (r/adapt-react-class (.-default MuiBreadcrumbs)))
