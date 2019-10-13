(ns reagent-material-ui.core.click-away-listener
  "Imports @material-ui/core/ClickAwayListener as a Reagent component.
   Original documentation is at https://material-ui.com/api/click-away-listener/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def click-away-listener (r/adapt-react-class (.-ClickAwayListener js/MaterialUI)))
