(ns reagent-material-ui.lab.skeleton
  "Imports @material-ui/lab/Skeleton as a Reagent component.
   Original documentation is at https://material-ui.com/api/skeleton/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/Skeleton" :as MuiSkeleton]))

(def skeleton (adapt-react-class (.-default MuiSkeleton) "mui-skeleton"))
