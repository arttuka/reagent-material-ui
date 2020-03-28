(ns reagent-material-ui.core.hidden
  "Imports @material-ui/core/Hidden as a Reagent component.
   Original documentation is at https://material-ui.com/api/hidden/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Hidden" :as Hidden]))

(def hidden (adapt-react-class (or (.-default Hidden) (.-Hidden Hidden)) "mui-hidden"))
