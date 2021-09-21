(ns reagent-mui.icons.skip-previous-two-tone
  "Imports @mui/icons-material/SkipPreviousTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def skip-previous-two-tone (create-svg-icon [(e "path" #js {"d" "M16 14.14V9.86L12.97 12z", "opacity" ".3"}) (e "path" #js {"d" "M6 6h2v12H6zm12 12V6l-8.5 6 8.5 6zm-2-3.86L12.97 12 16 9.86v4.28z"})]
                                             "SkipPreviousTwoTone"))
