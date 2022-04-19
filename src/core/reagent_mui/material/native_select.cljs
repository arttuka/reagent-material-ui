(ns reagent-mui.material.native-select
  "Imports @mui/material/NativeSelect as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/native-select/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/NativeSelect" :as MuiNativeSelect]))

(def native-select (adapt-react-class (.-default MuiNativeSelect) "mui-native-select"))
