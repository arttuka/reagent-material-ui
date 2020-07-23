(ns reagent-material-ui.lab.timeline-separator
  "Imports @material-ui/lab/TimelineSeparator as a Reagent component.
   Original documentation is at https://material-ui.com/api/timeline-separator/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/lab/TimelineSeparator" :as MuiTimelineSeparator]))

(def timeline-separator (adapt-react-class (or (.-default MuiTimelineSeparator) (.-TimelineSeparator MuiTimelineSeparator)) "mui-timeline-separator"))
