(ns reagent-material-ui.icons.east-two-tone
  "Imports @material-ui/icons/EastTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def east-two-tone (create-svg-icon (e "path" #js {"d" "m15 5-1.41 1.41L18.17 11H2v2h16.17l-4.59 4.59L15 19l7-7-7-7z"})
                                    "EastTwoTone"))
