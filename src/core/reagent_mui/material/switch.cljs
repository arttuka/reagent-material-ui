(ns reagent-mui.material.switch
  "Imports @mui/material/Switch as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/switch/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Switch" :as MuiSwitch]))

(def switch (r/adapt-react-class (.-default MuiSwitch)))
