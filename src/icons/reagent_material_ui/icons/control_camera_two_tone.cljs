(ns reagent-material-ui.icons.control-camera-two-tone
  "Imports @material-ui/icons/ControlCameraTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def control-camera-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7.3 13.77L5.54 12l1.76-1.77-1.76-1.77L2 12l3.54 3.54zm8.24 4.69l-1.77-1.76L12 18.46l-1.77-1.76-1.77 1.76L12 22zm2.92-2.92L22 12l-3.54-3.54-1.76 1.77L18.46 12l-1.76 1.77zM12 5.54l1.77 1.76 1.77-1.76L12 2 8.46 5.54l1.77 1.76z"}) (e "circle" #js {"cy" "12", "r" "3", "cx" "12"}))
                                              "ControlCameraTwoTone"))
