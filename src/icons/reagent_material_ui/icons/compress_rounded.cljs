(ns reagent-material-ui.icons.compress-rounded
  "Imports @material-ui/icons/CompressRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def compress-rounded (create-svg-icon (e "path" #js {"d" "M4 10c0 .55.45 1 1 1h14c.55 0 1-.45 1-1s-.45-1-1-1H5c-.55 0-1 .45-1 1zm10.79-6H13V2c0-.55-.45-1-1-1s-1 .45-1 1v2H9.21c-.45 0-.67.54-.36.85l2.79 2.79c.2.2.51.2.71 0l2.79-2.79c.32-.31.1-.85-.35-.85zM9.21 19H11v2c0 .55.45 1 1 1s1-.45 1-1v-2h1.79c.45 0 .67-.54.35-.85l-2.79-2.79c-.2-.2-.51-.2-.71 0l-2.79 2.79c-.31.31-.09.85.36.85zM5 14h14c.55 0 1-.45 1-1s-.45-1-1-1H5c-.55 0-1 .45-1 1s.45 1 1 1z"})
                                       "CompressRounded"))
