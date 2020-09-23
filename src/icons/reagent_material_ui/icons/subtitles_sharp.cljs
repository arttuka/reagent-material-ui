(ns reagent-material-ui.icons.subtitles-sharp
  "Imports @material-ui/icons/SubtitlesSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def subtitles-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2v16h20V4zM4 12h4v2H4v-2zm10 6H4v-2h10v2zm6 0h-4v-2h4v2zm0-4H10v-2h10v2z"})
                                      "SubtitlesSharp"))
