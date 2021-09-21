(ns reagent-mui.core.switch-unstyled
  "Imports @mui/core/SwitchUnstyled as a Reagent component.
   Original documentation is at https://mui.com/api/switch-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/core/SwitchUnstyled" :as MuiSwitchUnstyled]))

(def switch-unstyled (adapt-react-class (.-default MuiSwitchUnstyled) "mui-switch-unstyled"))
