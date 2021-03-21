(ns reagent-material-ui.icons.ondemand-video-two-tone
  "Imports @material-ui/icons/OndemandVideoTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def ondemand-video-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M3 17h18V5H3v12zM9 7l7 4-7 4V7z", "opacity" ".3"}) (e "path" #js {"d" "M9 7v8l7-4zm12-4H3c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h5v2h8v-2h5c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 14H3V5h18v12z"}))
                                              "OndemandVideoTwoTone"))
