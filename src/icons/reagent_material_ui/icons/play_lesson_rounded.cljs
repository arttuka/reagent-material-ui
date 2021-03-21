(ns reagent-material-ui.icons.play-lesson-rounded
  "Imports @material-ui/icons/PlayLessonRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def play-lesson-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18 11c.34 0 .67.03 1 .08V4c0-1.1-.9-2-2-2H5c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h7.26c-.79-1.13-1.26-2.51-1.26-4 0-3.87 3.13-7 7-7zm-10.24-.45c-.34.2-.76-.04-.76-.43V4h5v6.12c0 .39-.42.63-.76.43L9.5 9.5l-1.74 1.05z"}) (e "path" #js {"d" "M18 13c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.24-5-5-5zm-1.25 6.6v-3.2c0-.39.43-.63.76-.42l2.56 1.6c.31.2.31.65 0 .85l-2.56 1.6c-.33.2-.76-.04-.76-.43z"}))
                                          "PlayLessonRounded"))
