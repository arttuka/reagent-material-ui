(ns reagent-mui.lab.timeline-content
  "Imports @mui/lab/TimelineContent as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/timeline-content/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/TimelineContent" :as MuiTimelineContent]))

(def timeline-content (adapt-react-class (.-default MuiTimelineContent) "mui-timeline-content"))
