(ns reagent-material-ui.core.native-select
  "Imports @material-ui/core/NativeSelect as a Reagent component.
   Original documentation is at https://material-ui.com/api/native-select/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/NativeSelect" :as NativeSelect]))

(def native-select (adapt-react-class (or (.-default NativeSelect) (.-NativeSelect NativeSelect)) "mui-native-select"))
