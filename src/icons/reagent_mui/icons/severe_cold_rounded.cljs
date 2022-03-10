(ns reagent-mui.icons.severe-cold-rounded
  "Imports @mui/icons-material/SevereColdRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def severe-cold-rounded (create-svg-icon [(e "path" #js {"d" "M20 2c-.55 0-1 .45-1 1v3c0 .55.45 1 1 1s1-.45 1-1V3c0-.55-.45-1-1-1z"}) (e "circle" #js {"cx" "20", "cy" "9", "r" "1"}) (e "path" #js {"d" "m12 10.41 3.29-3.29c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0L12 7.59V5c0-.55-.45-1-1-1s-1 .45-1 1v2.59L8.12 5.71a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41L10 10.41V12H8.41L5.12 8.71a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41L5.59 12H3c-.55 0-1 .45-1 1s.45 1 1 1h2.59l-1.88 1.88c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0L8.41 14H10v1.59l-3.29 3.29c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0L10 18.41V21c0 .55.45 1 1 1s1-.45 1-1v-2.59l1.88 1.88c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L12 15.59V14h1.59l3.29 3.29c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41L16.41 14H19c.55 0 1-.45 1-1s-.45-1-1-1h-7v-1.59z"})]
                                          "SevereColdRounded"))
