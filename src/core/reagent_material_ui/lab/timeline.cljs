(ns reagent-material-ui.lab.timeline
  "Imports @material-ui/lab/Timeline as a Reagent component.
   Original documentation is at https://material-ui.com/api/timeline/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/Timeline" :as MuiTimeline]))

(def timeline (adapt-react-class (or (.-default MuiTimeline) (.-Timeline MuiTimeline)) "mui-timeline"))
