(ns reagent-mui.icons.mobile-friendly-sharp
  "Imports @mui/icons-material/MobileFriendlySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mobile-friendly-sharp (create-svg-icon (e "path" #js {"d" "M21 1H7v5h2V4h10v16H9v-2H7v5h14V1zM7.01 13.47l-2.55-2.55-1.27 1.27L7 16l7.19-7.19-1.27-1.27-5.91 5.93z"})
                                            "MobileFriendlySharp"))
