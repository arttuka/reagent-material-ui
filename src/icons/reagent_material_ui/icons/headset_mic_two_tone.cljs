(ns reagent-material-ui.icons.headset-mic-two-tone
  "Imports @material-ui/icons/HeadsetMicTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def headset-mic-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 17c0 .55.45 1 1 1h1v-4H5v3zm12-3h2v4h-2z", "opacity" ".3"}) (e "path" #js {"d" "M12 1c-4.97 0-9 4.03-9 9v7c0 1.66 1.34 3 3 3h3v-8H5v-2c0-3.87 3.13-7 7-7s7 3.13 7 7v2h-4v8h4v1h-7v2h6c1.66 0 3-1.34 3-3V10c0-4.97-4.03-9-9-9zM7 14v4H6c-.55 0-1-.45-1-1v-3h2zm12 4h-2v-4h2v4z"}))
                                           "HeadsetMicTwoTone"))
