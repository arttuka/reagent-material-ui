(ns reagent-material-ui.core.breadcrumbs
  "Imports @material-ui/core/Breadcrumbs as a Reagent component.
   Original documentation is at https://material-ui.com/api/breadcrumbs/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def breadcrumbs (adapt-react-class (.-Breadcrumbs js/MaterialUI) "mui-breadcrumbs"))
