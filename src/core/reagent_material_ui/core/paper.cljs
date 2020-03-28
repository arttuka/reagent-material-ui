(ns reagent-material-ui.core.paper
  "Imports @material-ui/core/Paper as a Reagent component.
   Original documentation is at https://material-ui.com/api/paper/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Paper" :as Paper]))

(def paper (adapt-react-class (or (.-default Paper) (.-Paper Paper)) "mui-paper"))
