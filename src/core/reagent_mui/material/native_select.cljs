(ns reagent-mui.material.native-select
  "Imports @mui/material/NativeSelect as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/native-select/ ."
  (:require [reagent.core :as r]
            ["@mui/material/NativeSelect" :as MuiNativeSelect]))

(def native-select (r/adapt-react-class (.-default MuiNativeSelect)))
