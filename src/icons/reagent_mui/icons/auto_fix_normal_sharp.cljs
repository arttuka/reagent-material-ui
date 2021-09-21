(ns reagent-mui.icons.auto-fix-normal-sharp
  "Imports @mui/icons-material/AutoFixNormalSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def auto-fix-normal-sharp (create-svg-icon (e "path" #js {"d" "m20 7 .94-2.06L23 4l-2.06-.94L20 1l-.94 2.06L17 4l2.06.94zm-1.59 2.83-4.24-4.24L1.59 18.17l4.24 4.24L18.41 9.83zm-4.2 1.38L12.8 9.8l1.38-1.38 1.41 1.41-1.38 1.38z"})
                                            "AutoFixNormalSharp"))
