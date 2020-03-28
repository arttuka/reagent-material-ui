(ns reagent-material-ui.core.slider
  "Imports @material-ui/core/Slider as a Reagent component.
   Original documentation is at https://material-ui.com/api/slider/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Slider" :as Slider]))

(def slider (adapt-react-class (or (.-default Slider) (.-Slider Slider)) "mui-slider"))
