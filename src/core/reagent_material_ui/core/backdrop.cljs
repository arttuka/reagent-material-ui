(ns reagent-material-ui.core.backdrop
  "Imports @material-ui/core/Backdrop as a Reagent component.
   Original documentation is at https://material-ui.com/api/backdrop/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Backdrop" :as MuiBackdrop]))

(def backdrop (adapt-react-class (or (.-default MuiBackdrop) (.-Backdrop MuiBackdrop)) "mui-backdrop"))
