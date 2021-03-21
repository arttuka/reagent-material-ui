(ns reagent-material-ui.icons.headset-mic-rounded
  "Imports @material-ui/icons/HeadsetMicRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def headset-mic-rounded (create-svg-icon (e "path" #js {"d" "M12 2c-4.97 0-9 4.03-9 9v7c0 1.1.9 2 2 2h2c1.1 0 2-.9 2-2v-4c0-1.1-.9-2-2-2H5v-1c0-3.87 3.13-7 7-7s7 3.13 7 7v1h-2c-1.1 0-2 .9-2 2v4c0 1.1.9 2 2 2h2v1h-6c-.55 0-1 .45-1 1s.45 1 1 1h6c1.1 0 2-.9 2-2V11c0-4.97-4.03-9-9-9z"})
                                          "HeadsetMicRounded"))
