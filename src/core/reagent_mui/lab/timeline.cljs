(ns reagent-mui.lab.timeline
  "Imports @mui/lab/Timeline as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/timeline/ ."
  (:require [reagent.core :as r]
            ["@mui/lab/Timeline" :as MuiTimeline]))

(def timeline (r/adapt-react-class (.-default MuiTimeline)))
