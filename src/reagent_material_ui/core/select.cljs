(ns reagent-material-ui.core.select
  "Imports @material-ui/core/Select as a Reagent component.
   Original documentation is at https://material-ui.com/api/select/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def select (adapt-react-class (.-Select js/MaterialUI) "mui-select"))
