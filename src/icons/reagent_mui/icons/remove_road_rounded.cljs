(ns reagent-mui.icons.remove-road-rounded
  "Imports @mui/icons-material/RemoveRoadRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def remove-road-rounded (create-svg-icon (e "path" #js {"d" "M19 4c-.55 0-1 .45-1 1v7c0 .55.45 1 1 1s1-.45 1-1V5c0-.55-.45-1-1-1zM5 20c.55 0 1-.45 1-1V5c0-.55-.45-1-1-1s-1 .45-1 1v14c0 .55.45 1 1 1zm7-12c.55 0 1-.45 1-1V5c0-.55-.45-1-1-1s-1 .45-1 1v2c0 .55.45 1 1 1zm0 6c.55 0 1-.45 1-1v-2c0-.55-.45-1-1-1s-1 .45-1 1v2c0 .55.45 1 1 1zm0 6c.55 0 1-.45 1-1v-2c0-.55-.45-1-1-1s-1 .45-1 1v2c0 .55.45 1 1 1zm9.79-4.29a.9959.9959 0 0 0-1.41 0L19 17.09l-1.38-1.38a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41l1.38 1.38-1.38 1.38c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0L19 19.91l1.38 1.38c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-1.38-1.38 1.38-1.38c.39-.39.39-1.02 0-1.41z"})
                                          "RemoveRoadRounded"))
