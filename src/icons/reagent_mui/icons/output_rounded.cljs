(ns reagent-mui.icons.output-rounded
  "Imports @mui/icons-material/OutputRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def output-rounded (create-svg-icon [(e "path" #js {"d" "m17.71 16.29 3.59-3.59c.39-.39.39-1.02 0-1.41L17.71 7.7a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41L18.17 11H10c-.55 0-1 .45-1 1s.45 1 1 1h8.17l-1.88 1.88c-.39.39-.39 1.02 0 1.41.39.39 1.03.39 1.42 0z"}) (e "path" #js {"d" "M19 19H5V5h14v1c0 .55.45 1 1 1s1-.45 1-1V5c0-1.1-.9-2-2-2H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.11 0 2-.9 2-2v-1c0-.55-.45-1-1-1s-1 .45-1 1v1z"})]
                                     "OutputRounded"))
