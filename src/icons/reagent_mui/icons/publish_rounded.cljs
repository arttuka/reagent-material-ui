(ns reagent-mui.icons.publish-rounded
  "Imports @mui/icons-material/PublishRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def publish-rounded (create-svg-icon (e "path" #js {"d" "M5 5c0 .55.45 1 1 1h12c.55 0 1-.45 1-1s-.45-1-1-1H6c-.55 0-1 .45-1 1zm2.41 9H9v5c0 .55.45 1 1 1h4c.55 0 1-.45 1-1v-5h1.59c.89 0 1.34-1.08.71-1.71L12.71 7.7a.9959.9959 0 0 0-1.41 0l-4.59 4.59c-.63.63-.19 1.71.7 1.71z"})
                                      "PublishRounded"))
