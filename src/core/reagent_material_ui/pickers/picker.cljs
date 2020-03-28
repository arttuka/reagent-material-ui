(ns reagent-material-ui.pickers.picker
  "Imports @material-ui/pickers/Picker as a Reagent component.
   Original documentation is at https://material-ui-pickers.dev/api/Picker/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/pickers" :as pickers]))

(def picker (adapt-react-class (.-Picker pickers) "mui-picker"))
