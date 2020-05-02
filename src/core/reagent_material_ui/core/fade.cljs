(ns reagent-material-ui.core.fade
  "Imports @material-ui/core/Fade as a Reagent component.
   Original documentation is at https://material-ui.com/api/fade/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Fade" :as MuiFade]))

(def fade (adapt-react-class (or (.-default MuiFade) (.-Fade MuiFade)) "mui-fade"))
