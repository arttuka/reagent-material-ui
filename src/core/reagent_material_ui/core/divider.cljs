(ns reagent-material-ui.core.divider
  "Imports @material-ui/core/Divider as a Reagent component.
   Original documentation is at https://material-ui.com/api/divider/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Divider" :as MuiDivider]))

(def divider (adapt-react-class (.-default MuiDivider) "mui-divider"))
