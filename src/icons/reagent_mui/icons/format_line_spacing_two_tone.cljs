(ns reagent-mui.icons.format-line-spacing-two-tone
  "Imports @mui/icons-material/FormatLineSpacingTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-line-spacing-two-tone (create-svg-icon (e "path" #js {"d" "M10 5h12v2H10zm0 12h12v2H10zm-8.5 0L5 20.5 8.5 17H6V7h2.5L5 3.5 1.5 7H4v10zm8.5-6h12v2H10z"})
                                                   "FormatLineSpacingTwoTone"))
