(ns reagent-material-ui.icons.flip-camera-ios-rounded
  "Imports @material-ui/icons/FlipCameraIosRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def flip-camera-ios-rounded (create-svg-icon (e "path" #js {"d" "M2 7v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2h-3.17l-1.38-1.51c-.29-.31-.69-.49-1.11-.49H9.66c-.42 0-.82.18-1.11.49L7.17 5H4c-1.1 0-2 .9-2 2zm8.75 10.83c-.55-.15-.74-.85-.33-1.25.19-.19.45-.26.71-.19.28.07.57.12.87.12 1.93 0 3.5-1.57 3.5-3.5h-.54c-.45 0-.67-.54-.35-.85l1.29-1.29c.2-.2.51-.2.71 0l1.29 1.29c.31.31.09.85-.35.85H17c0 2.76-2.24 5-5 5-.43-.01-.85-.07-1.25-.18zM7.4 15.15l-1.3-1.3c-.31-.31-.09-.85.36-.85H7c0-2.76 2.24-5 5-5 .43 0 .85.06 1.25.17.55.15.74.85.33 1.25-.19.19-.45.26-.71.19-.28-.07-.57-.11-.87-.11-1.93 0-3.5 1.57-3.5 3.5h.54c.45 0 .67.54.35.85l-1.29 1.3c-.19.19-.51.19-.7 0z"})
                                              "FlipCameraIosRounded"))
