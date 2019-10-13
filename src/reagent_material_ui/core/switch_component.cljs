(ns reagent-material-ui.core.switch-component
  "Imports @material-ui/core/Switch as a Reagent component.
   Original documentation is at https://material-ui.com/api/switch/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def switch (r/adapt-react-class (.-Switch js/MaterialUI)))
