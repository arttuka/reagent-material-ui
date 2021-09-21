(ns reagent-mui.icons.play-lesson-sharp
  "Imports @mui/icons-material/PlayLessonSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def play-lesson-sharp (create-svg-icon [(e "path" #js {"d" "M18 11c.34 0 .67.03 1 .08V2H3v20h9.26c-.79-1.13-1.26-2.51-1.26-4 0-3.87 3.13-7 7-7zM7 11V4h5v7L9.5 9.5 7 11z"}) (e "path" #js {"d" "M18 13c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.24-5-5-5zm-1.25 7.5v-5l4 2.5-4 2.5z"})]
                                        "PlayLessonSharp"))
