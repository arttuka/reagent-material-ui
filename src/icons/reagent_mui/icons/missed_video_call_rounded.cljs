(ns reagent-mui.icons.missed-video-call-rounded
  "Imports @mui/icons-material/MissedVideoCallRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def missed-video-call-rounded (create-svg-icon (e "path" #js {"d" "M17 10.5V7c0-.55-.45-1-1-1H4c-.55 0-1 .45-1 1v10c0 .55.45 1 1 1h12c.55 0 1-.45 1-1v-3.5l2.29 2.29c.63.63 1.71.18 1.71-.71V8.91c0-.89-1.08-1.34-1.71-.71L17 10.5zm-6.29 3.79c-.39.39-1.02.39-1.41 0l-3.18-3.18v2.55H5V9.72c0-.28.22-.5.5-.5h3.94v1.11H6.89l3.11 3.1 4.22-4.22.78.79-4.29 4.29z"})
                                                "MissedVideoCallRounded"))
