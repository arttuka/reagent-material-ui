(ns reagent-material-ui.icons.control-camera-rounded
  "Imports @material-ui/icons/ControlCameraRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def control-camera-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "12", "r" "3", "cx" "12"}) (e "path" #js {"d" "M5.54 8.46l-2.83 2.83c-.39.39-.39 1.02 0 1.41l2.83 2.83c.39.39 1.02.39 1.41 0 .39-.39.39-1.03 0-1.42L4.83 12l2.12-2.12c.39-.39.39-1.03 0-1.42-.39-.39-1.03-.38-1.41 0zm2.92-1.51c.39.39 1.03.39 1.42 0L12 4.83l2.12 2.12c.39.39 1.03.39 1.42 0 .39-.39.39-1.02 0-1.41l-2.83-2.83a.9959.9959 0 0 0-1.41 0L8.46 5.54c-.38.38-.39 1.02 0 1.41zm8.59 1.51c-.39.39-.39 1.03 0 1.42L19.17 12l-2.12 2.12c-.39.39-.39 1.03 0 1.42.39.39 1.02.39 1.41 0l2.83-2.83c.39-.39.39-1.02 0-1.41l-2.83-2.83c-.38-.39-1.02-.4-1.41-.01zM12 19.17l-2.12-2.12c-.39-.39-1.03-.39-1.42 0-.39.39-.39 1.02 0 1.41l2.83 2.83c.39.39 1.02.39 1.41 0l2.83-2.83c.39-.39.39-1.02 0-1.41-.39-.39-1.03-.39-1.42 0L12 19.17z"}))
                                             "ControlCameraRounded"))
