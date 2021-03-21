(ns reagent-material-ui.icons.loop-rounded
  "Imports @material-ui/icons/LoopRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def loop-rounded (create-svg-icon (e "path" #js {"d" "M6.35 13.99C5.01 10.29 7.71 6 12 6v1.79c0 .45.54.67.85.35l2.79-2.79c.2-.2.2-.51 0-.71l-2.79-2.79c-.31-.31-.85-.09-.85.36V4C6.24 4 2.61 9.78 4.52 14.79c.24.63 1.08.78 1.56.3l.08-.08c.26-.26.32-.66.19-1.02zm11.29-3.97C19.01 13.86 16.17 18 12 18v-1.79c0-.45-.54-.67-.85-.35l-2.79 2.79c-.2.2-.2.51 0 .71l2.79 2.79c.31.31.85.09.85-.35V20c5.76 0 9.39-5.78 7.48-10.79-.24-.63-1.08-.78-1.56-.3l-.07.07c-.27.27-.33.67-.21 1.04z"})
                                   "LoopRounded"))
