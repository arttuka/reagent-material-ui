(ns reagent-mui.material.switch-component
  "Imports @mui/material/Switch as a Reagent component.
   Original documentation is at https://mui.com/api/switch/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Switch" :as MuiSwitch]))

(def switch (adapt-react-class (.-default MuiSwitch) "mui-switch"))
