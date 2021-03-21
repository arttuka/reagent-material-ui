(ns reagent-material-ui.icons.flip-camera-android-rounded
  "Imports @material-ui/icons/FlipCameraAndroidRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def flip-camera-android-rounded (create-svg-icon (e "path" #js {"d" "M9 12c0 1.66 1.34 3 3 3s3-1.34 3-3-1.34-3-3-3-3 1.34-3 3zm12.5 2h-4.29c-.45 0-.67.54-.35.85l1.69 1.69C17.1 18.63 14.72 20 12 20c-3.49 0-6.45-2.24-7.54-5.36-.14-.39-.53-.64-.94-.64-.68 0-1.18.67-.96 1.31C3.93 19.21 7.64 22 12 22c3.27 0 6.18-1.58 8-4l1.15 1.15c.32.32.85.09.85-.35v-4.3c0-.28-.22-.5-.5-.5zM7.15 9.15l-1.7-1.7C6.9 5.37 9.28 4 12 4c3.49 0 6.45 2.24 7.54 5.36.14.39.53.64.94.64.68 0 1.18-.67.96-1.31C20.07 4.79 16.36 2 12 2 8.73 2 5.82 3.58 4 6L2.85 4.85c-.31-.31-.85-.09-.85.36V9.5c0 .28.22.5.5.5h4.29c.45 0 .67-.54.36-.85z"})
                                                  "FlipCameraAndroidRounded"))
