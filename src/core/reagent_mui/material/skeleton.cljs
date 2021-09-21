(ns reagent-mui.material.skeleton
  "Imports @mui/material/Skeleton as a Reagent component.
   Original documentation is at https://mui.com/api/skeleton/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/material/Skeleton" :as MuiSkeleton]))

(def skeleton (adapt-react-class (.-default MuiSkeleton) "mui-skeleton"))
