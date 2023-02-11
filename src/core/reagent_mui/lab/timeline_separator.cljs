(ns reagent-mui.lab.timeline-separator
  "Imports @mui/lab/TimelineSeparator as a Reagent component.
   Original documentation is at https://mui.com/material-ui/api/timeline-separator/ ."
  (:require [reagent.core :as r]
            ["@mui/lab/TimelineSeparator" :as MuiTimelineSeparator]))

(def timeline-separator (r/adapt-react-class (.-default MuiTimelineSeparator)))
