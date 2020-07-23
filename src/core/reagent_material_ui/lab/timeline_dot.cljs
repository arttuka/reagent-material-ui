(ns reagent-material-ui.lab.timeline-dot
  "Imports @material-ui/lab/TimelineDot as a Reagent component.
   Original documentation is at https://material-ui.com/api/timeline-dot/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/TimelineDot" :as MuiTimelineDot]))

(def timeline-dot (adapt-react-class (or (.-default MuiTimelineDot) (.-TimelineDot MuiTimelineDot)) "mui-timeline-dot"))
