(ns reagent-material-ui.lab.timeline-item
  "Imports @material-ui/lab/TimelineItem as a Reagent component.
   Original documentation is at https://material-ui.com/api/timeline-item/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/TimelineItem" :as MuiTimelineItem]))

(def timeline-item (adapt-react-class (.-default MuiTimelineItem) "mui-timeline-item"))
