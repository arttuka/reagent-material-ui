(ns reagent-material-ui.lab.skeleton
  "Imports @material-ui/lab/Skeleton as a Reagent component.
   Original documentation is at https://material-ui.com/api/skeleton/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/Skeleton" :as Skeleton]))

(def skeleton (adapt-react-class (or (.-default Skeleton) (.-Skeleton Skeleton)) "mui-skeleton"))
