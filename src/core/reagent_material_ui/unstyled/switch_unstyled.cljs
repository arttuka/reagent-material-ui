(ns reagent-material-ui.unstyled.switch-unstyled
  "Imports @material-ui/unstyled/SwitchUnstyled as a Reagent component.
   Original documentation is at https://material-ui.com/api/switch-unstyled/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/unstyled/SwitchUnstyled" :as MuiSwitchUnstyled]))

(def switch-unstyled (adapt-react-class (.-default MuiSwitchUnstyled) "mui-switch-unstyled"))
