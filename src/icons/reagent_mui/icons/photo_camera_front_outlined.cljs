(ns reagent-mui.icons.photo-camera-front-outlined
  "Imports @mui/icons-material/PhotoCameraFrontOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def photo-camera-front-outlined (create-svg-icon [(e "path" #js {"d" "M20 5h-3.17L15 3H9L7.17 5H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2zm0 14H4V7h4.05l1.83-2h4.24l1.83 2H20v12z"}) (e "circle" #js {"cx" "12", "cy" "11", "r" "2"}) (e "path" #js {"d" "M14.78 14.58c-.85-.37-1.79-.58-2.78-.58s-1.93.21-2.78.58C8.48 14.9 8 15.62 8 16.43V17h8v-.57c0-.81-.48-1.53-1.22-1.85z"})]
                                                  "PhotoCameraFrontOutlined"))
