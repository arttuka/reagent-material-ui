(ns reagent-material-ui.icons.fence-two-tone
  "Imports @material-ui/icons/FenceTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def fence-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M16 6.83l1 1V10h-2V7.83l.41-.41.59-.59zm-4 0l.59.59.41.41V10h-2V7.83l.41-.41.59-.59zM11 14v-2h2v2h-2zm2 2v2h-2v-2h2zM7 7.83l1-1 .59.59.41.41V10H7V7.83zM7 12h2v2H7v-2zm0 4h2v2H7v-2zm10 2h-2v-2h2v2zm0-4h-2v-2h2v2z", "opacity" ".3"}) (e "path" #js {"d" "M21 12v-2h-2V7l-3-3-2 2-2-2-2 2-2-2-3 3v3H3v2h2v2H3v2h2v4h14v-4h2v-2h-2v-2h2zm-5-5.17l1 1V10h-2V7.83l.41-.41.59-.59zm-4 0l.59.59.41.41V10h-2V7.83l.41-.41.59-.59zM11 14v-2h2v2h-2zm2 2v2h-2v-2h2zM7 7.83l1-1 .59.59.41.41V10H7V7.83zM7 12h2v2H7v-2zm0 4h2v2H7v-2zm10 2h-2v-2h2v2zm0-4h-2v-2h2v2z"}))
                                     "FenceTwoTone"))
