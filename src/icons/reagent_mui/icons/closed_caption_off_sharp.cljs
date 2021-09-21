(ns reagent-mui.icons.closed-caption-off-sharp
  "Imports @mui/icons-material/ClosedCaptionOffSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def closed-caption-off-sharp (create-svg-icon (e "path" #js {"d" "M21 4H3v16h18V4zm-10 7H9.5v-.5h-2v3h2V13H11v2H6V9h5v2zm7 0h-1.5v-.5h-2v3h2V13H18v2h-5V9h5v2z"})
                                               "ClosedCaptionOffSharp"))
