(ns reagent-mui.lab.timeline-content
  "Imports @mui/lab/TimelineContent as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/timeline-content/ ."
  (:require [reagent.core :as r]
            ["@mui/lab/TimelineContent" :as MuiTimelineContent]))

(def timeline-content (r/adapt-react-class (.-default MuiTimelineContent)))
