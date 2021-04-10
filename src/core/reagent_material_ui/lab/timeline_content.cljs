(ns reagent-material-ui.lab.timeline-content
  "Imports @material-ui/lab/TimelineContent as a Reagent component.
   Original documentation is at https://material-ui.com/api/timeline-content/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/TimelineContent" :as MuiTimelineContent]))

(def timeline-content (adapt-react-class (.-default MuiTimelineContent) "mui-timeline-content"))
