(ns reagent-mui.material.breadcrumbs
  "Imports @mui/material/Breadcrumbs as a Reagent component.
   Original documentation is at https://mui.com/api/breadcrumbs/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Breadcrumbs" :as MuiBreadcrumbs]))

(def breadcrumbs (adapt-react-class (.-default MuiBreadcrumbs) "mui-breadcrumbs"))
