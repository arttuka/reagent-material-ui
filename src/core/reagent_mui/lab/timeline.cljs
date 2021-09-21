(ns reagent-mui.lab.timeline
  "Imports @mui/lab/Timeline as a Reagent component.
   Original documentation is at https://mui.com/api/timeline/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/Timeline" :as MuiTimeline]))

(def timeline (adapt-react-class (.-default MuiTimeline) "mui-timeline"))
