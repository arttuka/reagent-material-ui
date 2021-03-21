(ns reagent-material-ui.core.skeleton
  "Imports @material-ui/core/Skeleton as a Reagent component.
   Original documentation is at https://material-ui.com/api/skeleton/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Skeleton" :as MuiSkeleton]))

(def skeleton (adapt-react-class (.-default MuiSkeleton) "mui-skeleton"))
