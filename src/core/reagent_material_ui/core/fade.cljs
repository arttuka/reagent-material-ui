(ns reagent-material-ui.core.fade
  "Imports @material-ui/core/Fade as a Reagent component.
   Original documentation is at https://material-ui.com/api/fade/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Fade" :as Fade]))

(def fade (adapt-react-class (or (.-default Fade) (.-Fade Fade)) "mui-fade"))
