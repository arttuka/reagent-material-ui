(ns reagent-material-ui.icons.subtitles-off-sharp
  "Imports @material-ui/icons/SubtitlesOffSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def subtitles-off-sharp (create-svg-icon (e "path" #js {"d" "M6.83 4l8 8H20v2h-3.17L22 19.17V4zM1.04 3.87l.96.96V20h15.17l2.96 2.96 1.41-1.41L2.45 2.45 1.04 3.87zM4 12h4v2H4v-2zm0 4h9.17l.83.83V18H4v-2z"})
                                          "SubtitlesOffSharp"))
