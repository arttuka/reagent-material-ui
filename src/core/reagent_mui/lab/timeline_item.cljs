(ns reagent-mui.lab.timeline-item
  "Imports @mui/lab/TimelineItem as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/timeline-item/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/TimelineItem" :as MuiTimelineItem]))

(def timeline-item (adapt-react-class (.-default MuiTimelineItem) "mui-timeline-item"))
