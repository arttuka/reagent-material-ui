(ns reagent-material-ui.core.typography
  "Imports @material-ui/core/Typography as a Reagent component.
   Original documentation is at https://material-ui.com/api/typography/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def typography (adapt-react-class (.-Typography js/MaterialUI) "mui-typography"))
