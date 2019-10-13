(ns reagent-material-ui.core.root-ref
  "Imports @material-ui/core/RootRef as a Reagent component.
   Original documentation is at https://material-ui.com/api/root-ref/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def root-ref (r/adapt-react-class (.-RootRef js/MaterialUI)))
