(ns reagent-mui.lab.timeline-item
  "Imports @mui/lab/TimelineItem as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/timeline-item/ ."
  (:require [reagent.core :as r]
            ["@mui/lab/TimelineItem" :as MuiTimelineItem]))

(def timeline-item (r/adapt-react-class (.-default MuiTimelineItem)))
