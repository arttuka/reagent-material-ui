(ns reagent-material-ui.icons.video-camera-front-outlined
  "Imports @material-ui/icons/VideoCameraFrontOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def video-camera-front-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M18 10.48V6c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2v-4.48l4 3.98v-11l-4 3.98zm-2-.79V18H4V6h12v3.69z"}) (e "circle" #js {"cy" "10", "r" "2", "cx" "10"}) (e "path" #js {"d" "M14 15.43c0-.81-.48-1.53-1.22-1.85-.85-.37-1.79-.58-2.78-.58-.99 0-1.93.21-2.78.58C6.48 13.9 6 14.62 6 15.43V16h8v-.57z"}))
                                                  "VideoCameraFrontOutlined"))