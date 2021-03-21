(ns reagent-material-ui.icons.transform-rounded
  "Imports @material-ui/icons/TransformRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def transform-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M11 9h4v4h2V9c0-1.1-.9-2-2-2h-4v2z"}) (e "path" #js {"d" "M22 16c0-.55-.45-1-1-1H9V5h1.79c.45 0 .67-.54.35-.85l-2.79-2.8c-.2-.2-.51-.2-.71 0l-2.79 2.8c-.31.31-.09.85.36.85H7v2H3c-.55 0-1 .45-1 1s.45 1 1 1h4v6c0 1.1.9 2 2 2h6v2h-1.79c-.45 0-.67.54-.35.85l2.79 2.79c.2.2.51.2.71 0l2.79-2.79c.31-.31.09-.85-.35-.85H17v-2h4c.55 0 1-.45 1-1z"}))
                                        "TransformRounded"))
