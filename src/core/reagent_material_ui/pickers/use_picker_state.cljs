(ns reagent-material-ui.pickers.use-picker-state
  "Imports @material-ui/pickers/usePickerState as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/usePickerState/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def use-picker-state (adapt-react-class (.-usePickerState pickers) "mui-use-picker-state"))
