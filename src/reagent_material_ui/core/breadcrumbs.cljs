(ns reagent-material-ui.core.breadcrumbs
  "Imports @material-ui/core/Breadcrumbs as a Reagent component.
   Original documentation is at https://material-ui.com/api/breadcrumbs/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def breadcrumbs (r/adapt-react-class (.-Breadcrumbs js/MaterialUI)))
