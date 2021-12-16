(ns reagent-mui.icons.keyboard-double-arrow-right-sharp
  "Imports @mui/icons-material/KeyboardDoubleArrowRightSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def keyboard-double-arrow-right-sharp (create-svg-icon [(e "path" #js {"d" "M6.41 6 5 7.41 9.58 12 5 16.59 6.41 18l6-6z"}) (e "path" #js {"d" "m13 6-1.41 1.41L16.17 12l-4.58 4.59L13 18l6-6z"})]
                                                        "KeyboardDoubleArrowRightSharp"))
