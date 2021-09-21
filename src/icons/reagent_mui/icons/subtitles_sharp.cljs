(ns reagent-mui.icons.subtitles-sharp
  "Imports @mui/icons-material/SubtitlesSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def subtitles-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2v16h20V4zM4 12h4v2H4v-2zm10 6H4v-2h10v2zm6 0h-4v-2h4v2zm0-4H10v-2h10v2z"})
                                      "SubtitlesSharp"))
