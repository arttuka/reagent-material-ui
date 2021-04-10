(ns reagent-material-ui.icons.mobile-friendly-sharp
  "Imports @material-ui/icons/MobileFriendlySharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def mobile-friendly-sharp (create-svg-icon (e "path" #js {"d" "M21 1H7v5h2V4h10v16H9v-2H7v5h14V1zM7.01 13.47l-2.55-2.55-1.27 1.27L7 16l7.19-7.19-1.27-1.27-5.91 5.93z"})
                                            "MobileFriendlySharp"))
