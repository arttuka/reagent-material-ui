(ns reagent-mui.icons.video-camera-back-two-tone
  "Imports @mui/icons-material/VideoCameraBackTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def video-camera-back-two-tone (create-svg-icon [(e "path" #js {"d" "M4 18h12V6H4v12zm3.38-5.17L9 15l2.62-3.5L15 16H5l2.38-3.17z", "opacity" ".3"}) (e "path" #js {"d" "M11.62 11.5 9 15l-1.62-2.17L5 16h10z"}) (e "path" #js {"d" "M18 10.48V6c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2v-4.48l4 3.98v-11l-4 3.98zM16 18H4V6h12v12z"})]
                                                 "VideoCameraBackTwoTone"))
