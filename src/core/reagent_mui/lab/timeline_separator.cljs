(ns reagent-mui.lab.timeline-separator
  "Imports @mui/lab/TimelineSeparator as a Reagent component.
   Original documentation is at https://mui.com/api/timeline-separator/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/lab/TimelineSeparator" :as MuiTimelineSeparator]))

(def timeline-separator (adapt-react-class (.-default MuiTimelineSeparator) "mui-timeline-separator"))
