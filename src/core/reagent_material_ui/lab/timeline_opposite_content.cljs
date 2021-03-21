(ns reagent-material-ui.lab.timeline-opposite-content
  "Imports @material-ui/lab/TimelineOppositeContent as a Reagent component.
   Original documentation is at https://material-ui.com/api/timeline-opposite-content/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/TimelineOppositeContent" :as MuiTimelineOppositeContent]))

(def timeline-opposite-content (adapt-react-class (.-default MuiTimelineOppositeContent) "mui-timeline-opposite-content"))
