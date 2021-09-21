(ns reagent-mui.icons.camera-indoor-sharp
  "Imports @mui/icons-material/CameraIndoorSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def camera-indoor-sharp (create-svg-icon (e "path" #js {"d" "M12 3 4 9v12h16V9l-8-6zm4 13.06L14 15v2H8v-6h6v2l2-1.06v4.12z"})
                                          "CameraIndoorSharp"))
