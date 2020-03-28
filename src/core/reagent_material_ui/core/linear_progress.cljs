(ns reagent-material-ui.core.linear-progress
  "Imports @material-ui/core/LinearProgress as a Reagent component.
   Original documentation is at https://material-ui.com/api/linear-progress/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/LinearProgress" :as LinearProgress]))

(def linear-progress (adapt-react-class (or (.-default LinearProgress) (.-LinearProgress LinearProgress)) "mui-linear-progress"))
