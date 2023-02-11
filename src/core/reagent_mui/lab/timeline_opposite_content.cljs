(ns reagent-mui.lab.timeline-opposite-content
  "Imports @mui/lab/TimelineOppositeContent as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/timeline-opposite-content/ ."
  (:require [reagent.core :as r]
            ["@mui/lab/TimelineOppositeContent" :as MuiTimelineOppositeContent]))

(def timeline-opposite-content (r/adapt-react-class (.-default MuiTimelineOppositeContent)))
