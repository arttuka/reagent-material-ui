(ns reagent-material-ui.core.radio
  "Imports @material-ui/core/Radio as a Reagent component.
   Original documentation is at https://material-ui.com/api/radio/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Radio" :as MuiRadio]))

(def radio (adapt-react-class (.-default MuiRadio) "mui-radio"))
