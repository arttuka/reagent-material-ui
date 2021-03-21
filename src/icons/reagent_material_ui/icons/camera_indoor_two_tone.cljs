(ns reagent-material-ui.icons.camera-indoor-two-tone
  "Imports @material-ui/icons/CameraIndoorTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def camera-indoor-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M6 10v9h12v-9l-6-4.5L6 10zm8 2v1l2-1.06v4.12L14 15v1c0 .55-.45 1-1 1H9c-.55 0-1-.45-1-1v-4c0-.55.45-1 1-1h4c.55 0 1 .45 1 1z", "opacity" ".3"}) (e "path" #js {"d" "M8 12v4c0 .55.45 1 1 1h4c.55 0 1-.45 1-1v-1l2 1.06v-4.12L14 13v-1c0-.55-.45-1-1-1H9c-.55 0-1 .45-1 1z"}) (e "path" #js {"d" "M12 3L4 9v12h16V9l-8-6zm6 16H6v-9l6-4.5 6 4.5v9z"}))
                                             "CameraIndoorTwoTone"))
