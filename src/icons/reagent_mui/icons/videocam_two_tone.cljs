(ns reagent-mui.icons.videocam-two-tone
  "Imports @mui/icons-material/VideocamTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def videocam-two-tone (create-svg-icon [(e "path" #js {"d" "M5 8h10v8H5z", "opacity" ".3"}) (e "path" #js {"d" "M17 7c0-.55-.45-1-1-1H4c-.55 0-1 .45-1 1v10c0 .55.45 1 1 1h12c.55 0 1-.45 1-1v-3.5l4 4v-11l-4 4V7zm-2 9H5V8h10v8z"})]
                                        "VideocamTwoTone"))
