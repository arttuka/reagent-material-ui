(ns reagent-mui.lab.timeline-dot
  "Imports @mui/lab/TimelineDot as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/timeline-dot/ ."
  (:require [reagent.core :as r]
            ["@mui/lab/TimelineDot" :as MuiTimelineDot]))

(def timeline-dot (r/adapt-react-class (.-default MuiTimelineDot)))
