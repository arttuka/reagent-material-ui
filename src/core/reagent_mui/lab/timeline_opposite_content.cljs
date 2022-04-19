(ns reagent-mui.lab.timeline-opposite-content
  "Imports @mui/lab/TimelineOppositeContent as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/timeline-opposite-content/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/TimelineOppositeContent" :as MuiTimelineOppositeContent]))

(def timeline-opposite-content (adapt-react-class (.-default MuiTimelineOppositeContent) "mui-timeline-opposite-content"))
