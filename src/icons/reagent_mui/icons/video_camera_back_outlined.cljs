(ns reagent-mui.icons.video-camera-back-outlined
  "Imports @mui/icons-material/VideoCameraBackOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def video-camera-back-outlined (create-svg-icon (e "path" #js {"d" "M18 10.48V6c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2v-4.48l4 3.98v-11l-4 3.98zM16 18H4V6h12v12zm-4.38-6.5L9 15l-1.62-2.17L5 16h10l-3.38-4.5z"})
                                                 "VideoCameraBackOutlined"))
