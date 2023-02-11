(ns reagent-mui.material.skeleton
  "Imports @mui/material/Skeleton as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/skeleton/ ."
  (:require [reagent.core :as r]
            ["@mui/material/Skeleton" :as MuiSkeleton]))

(def skeleton (r/adapt-react-class (.-default MuiSkeleton)))
