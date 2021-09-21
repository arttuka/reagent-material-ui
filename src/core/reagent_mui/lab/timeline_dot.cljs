(ns reagent-mui.lab.timeline-dot
  "Imports @mui/lab/TimelineDot as a Reagent component.
   Original documentation is at https://mui.com/api/timeline-dot/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/TimelineDot" :as MuiTimelineDot]))

(def timeline-dot (adapt-react-class (.-default MuiTimelineDot) "mui-timeline-dot"))
