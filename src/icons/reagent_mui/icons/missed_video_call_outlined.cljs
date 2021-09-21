(ns reagent-mui.icons.missed-video-call-outlined
  "Imports @mui/icons-material/MissedVideoCallOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def missed-video-call-outlined (create-svg-icon (e "path" #js {"d" "M17 10.5V7c0-.55-.45-1-1-1H4c-.55 0-1 .45-1 1v10c0 .55.45 1 1 1h12c.55 0 1-.45 1-1v-3.5l4 4v-11l-4 4zm-2-1.83V16H5V8h10v.67zm-7.89 2.44L11 15l3.77-3.79-.78-.79L11 13.43l-3.11-3.1h2.55V9.22H6v4.44h1.11z"})
                                                 "MissedVideoCallOutlined"))
