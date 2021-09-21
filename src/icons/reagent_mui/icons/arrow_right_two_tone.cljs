(ns reagent-mui.icons.arrow-right-two-tone
  "Imports @mui/icons-material/ArrowRightTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-right-two-tone (create-svg-icon (e "path" #js {"d" "m10 17 5-5-5-5v10z"})
                                           "ArrowRightTwoTone"))
