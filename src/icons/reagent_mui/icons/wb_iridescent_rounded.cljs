(ns reagent-mui.icons.wb-iridescent-rounded
  "Imports @mui/icons-material/WbIridescentRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wb-iridescent-rounded (create-svg-icon (e "path" #js {"d" "M6 15h12c.55 0 1-.45 1-1v-3.95c0-.55-.45-1-1-1H6c-.55 0-1 .45-1 1V14c0 .55.45 1 1 1zm5-13v1.05c0 .55.45.95 1 .95s1-.4 1-.95V2c0-.55-.45-1-1-1s-1 .45-1 1zm7.34 2.3-.38.38c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0l.38-.38c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0zM13 22v-.96c0-.55-.45-1-1-1s-1 .45-1 1V22c0 .55.45 1 1 1s1-.45 1-1zm6.74-3.61-.39-.39a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l.38.39c.39.39 1.02.39 1.41 0l.01-.01c.39-.38.39-1.02 0-1.4zM4.25 5.71l.39.39c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-.39-.39a.9959.9959 0 0 0-1.41 0c-.38.39-.38 1.03 0 1.41zm1.42 14.08.38-.38c.39-.39.39-1.02 0-1.41a.9959.9959 0 0 0-1.41 0l-.38.38c-.39.39-.39 1.02 0 1.41.38.39 1.02.39 1.41 0z"})
                                            "WbIridescentRounded"))
