(ns reagent-material-ui.icons.invert-colors-two-tone
  "Imports @material-ui/icons/InvertColorsTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def invert-colors-two-tone (create-svg-icon [(e "path" #js {"d" "M7.75 8.99C6.62 10.1 6 11.57 6 13.13 6 16.37 8.69 19 12 19V4.81L7.75 8.99z", "opacity" ".3"}) (e "path" #js {"d" "M17.65 7.56 12 2 6.35 7.56C4.9 8.99 4 10.96 4 13.13 4 17.48 7.58 21 12 21s8-3.52 8-7.87c0-2.17-.9-4.14-2.35-5.57zM6 13.13c0-1.56.62-3.03 1.75-4.14L12 4.81V19c-3.31 0-6-2.63-6-5.87z"})]
                                             "InvertColorsTwoTone"))
