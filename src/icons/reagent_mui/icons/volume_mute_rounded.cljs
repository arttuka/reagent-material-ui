(ns reagent-mui.icons.volume-mute-rounded
  "Imports @mui/icons-material/VolumeMuteRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def volume-mute-rounded (create-svg-icon (e "path" #js {"d" "M7 10v4c0 .55.45 1 1 1h3l3.29 3.29c.63.63 1.71.18 1.71-.71V6.41c0-.89-1.08-1.34-1.71-.71L11 9H8c-.55 0-1 .45-1 1z"})
                                          "VolumeMuteRounded"))
