(ns reagent-material-ui.core.slide
  "Imports @material-ui/core/Slide as a Reagent component.
   Original documentation is at https://material-ui.com/api/slide/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def slide (adapt-react-class (.-Slide js/MaterialUI) "mui-slide"))
