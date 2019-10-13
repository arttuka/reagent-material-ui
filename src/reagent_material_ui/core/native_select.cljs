(ns reagent-material-ui.core.native-select
  "Imports @material-ui/core/NativeSelect as a Reagent component.
   Original documentation is at https://material-ui.com/api/native-select/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def native-select (r/adapt-react-class (.-NativeSelect js/MaterialUI)))
