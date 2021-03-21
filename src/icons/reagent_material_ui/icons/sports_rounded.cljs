(ns reagent-material-ui.icons.sports-rounded
  "Imports @material-ui/icons/SportsRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sports-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M21 7H11c-1.61 0-3.07.64-4.15 1.67C6.51 7.7 5.59 7 4.5 7 3.12 7 2 8.12 2 9.5S3.12 12 4.5 12c.21 0 .41-.03.6-.08-.06.35-.1.71-.1 1.08 0 3.31 2.69 6 6 6s6-2.69 6-6v-2h4c.55 0 1-.45 1-1V8c0-.55-.45-1-1-1zM4.5 10.5c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm6.5 6c-1.93 0-3.5-1.57-3.5-3.5S9.07 9.5 11 9.5s3.5 1.57 3.5 3.5-1.57 3.5-3.5 3.5z"}) (e "circle" #js {"cy" "13", "r" "2", "cx" "11"}))
                                     "SportsRounded"))
