(ns reagent-material-ui.core.popover
  "Imports @material-ui/core/Popover as a Reagent component.
   Original documentation is at https://material-ui.com/api/popover/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def popover (r/adapt-react-class (.-Popover js/MaterialUI)))
