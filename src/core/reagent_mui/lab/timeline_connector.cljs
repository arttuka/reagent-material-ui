(ns reagent-mui.lab.timeline-connector
  "Imports @mui/lab/TimelineConnector as a Reagent component.
   Original documentation is at https://mui.com/api/timeline-connector/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/TimelineConnector" :as MuiTimelineConnector]))

(def timeline-connector (adapt-react-class (.-default MuiTimelineConnector) "mui-timeline-connector"))
