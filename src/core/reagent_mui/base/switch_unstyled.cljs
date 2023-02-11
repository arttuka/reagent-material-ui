(ns reagent-mui.base.switch-unstyled
  "Imports @mui/base/SwitchUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/switch-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/SwitchUnstyled" :as MuiSwitchUnstyled]))

(def switch-unstyled (r/adapt-react-class (.-default MuiSwitchUnstyled)))
