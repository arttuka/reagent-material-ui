(ns reagent-mui.icons.fast-rewind-two-tone
  "Imports @mui/icons-material/FastRewindTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def fast-rewind-two-tone (create-svg-icon [(e "path" #js {"d" "M9 14.14V9.86L5.97 12zm9 0V9.86L14.97 12z", "opacity" ".3"}) (e "path" #js {"d" "m11 6-8.5 6 8.5 6V6zm-2 8.14L5.97 12 9 9.86v4.28zM20 6l-8.5 6 8.5 6V6zm-2 8.14L14.97 12 18 9.86v4.28z"})]
                                           "FastRewindTwoTone"))
