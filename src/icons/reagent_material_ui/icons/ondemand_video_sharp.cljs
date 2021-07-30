(ns reagent-material-ui.icons.ondemand-video-sharp
  "Imports @material-ui/icons/OndemandVideoSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def ondemand-video-sharp (create-svg-icon (e "path" #js {"d" "M23 3H1v16h7v2h8v-2h6.99L23 3zm-2 14H3V5h18v12zm-5-6-7 4V7l7 4z"})
                                           "OndemandVideoSharp"))
