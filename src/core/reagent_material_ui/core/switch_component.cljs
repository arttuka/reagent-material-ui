(ns reagent-material-ui.core.switch-component
  "Imports @material-ui/core/Switch as a Reagent component.
   Original documentation is at https://material-ui.com/api/switch/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Switch" :as MuiSwitch]))

(def switch (adapt-react-class (.-default MuiSwitch) "mui-switch"))
