(ns reagent-material-ui.lab.timeline-connector
  "Imports @material-ui/lab/TimelineConnector as a Reagent component.
   Original documentation is at https://material-ui.com/api/timeline-connector/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/TimelineConnector" :as MuiTimelineConnector]))

(def timeline-connector (adapt-react-class (.-default MuiTimelineConnector) "mui-timeline-connector"))
