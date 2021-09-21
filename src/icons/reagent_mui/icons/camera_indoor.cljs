(ns reagent-mui.icons.camera-indoor
  "Imports @mui/icons-material/CameraIndoor as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def camera-indoor (create-svg-icon (e "path" #js {"d" "M12 3 4 9v12h16V9l-8-6zm4 13.06L14 15v1c0 .55-.45 1-1 1H9c-.55 0-1-.45-1-1v-4c0-.55.45-1 1-1h4c.55 0 1 .45 1 1v1l2-1.06v4.12z"})
                                    "CameraIndoor"))
