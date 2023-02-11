(ns reagent-mui.lab.timeline-connector
  "Imports @mui/lab/TimelineConnector as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/timeline-connector/ ."
  (:require [reagent.core :as r]
            ["@mui/lab/TimelineConnector" :as MuiTimelineConnector]))

(def timeline-connector (r/adapt-react-class (.-default MuiTimelineConnector)))
