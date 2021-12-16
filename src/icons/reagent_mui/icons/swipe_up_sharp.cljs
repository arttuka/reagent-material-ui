(ns reagent-mui.icons.swipe-up-sharp
  "Imports @mui/icons-material/SwipeUpSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def swipe-up-sharp (create-svg-icon (e "path" #js {"d" "M2.06 5.56 1 4.5 4.5 1 8 4.5 6.94 5.56 5.32 3.94C5.11 4.76 5 5.62 5 6.5c0 2.42.82 4.65 2.2 6.43L6.13 14C4.49 11.95 3.5 9.34 3.5 6.5c0-.92.1-1.82.3-2.68L2.06 5.56zm19.65 5.62 2.09 7.39-8.23 3.65-6.84-2.85.61-1.62 3.8-.75-4.35-9.83c-.34-.76 0-1.64.76-1.98.76-.34 1.64 0 1.98.76l2.43 5.49 1.26-.56 6.49.3z"})
                                     "SwipeUpSharp"))
