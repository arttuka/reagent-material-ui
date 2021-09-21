(ns reagent-mui.icons.network-locked-rounded
  "Imports @mui/icons-material/NetworkLockedRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def network-locked-rounded (create-svg-icon (e "path" #js {"d" "M22 12V4.42c0-.89-1.08-1.34-1.71-.71L3.71 20.29c-.63.63-.19 1.71.7 1.71H15v-6c0-2.21 1.79-4 4-4h3zm0 5v-1c0-1.1-.9-2-2-2s-2 .9-2 2v1c-.55 0-1 .45-1 1v3c0 .55.45 1 1 1h4c.55 0 1-.45 1-1v-3c0-.55-.45-1-1-1zm-3-1c0-.55.45-1 1-1s1 .45 1 1v1h-2v-1z"})
                                             "NetworkLockedRounded"))
