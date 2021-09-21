(ns reagent-mui.icons.arrow-right-outlined
  "Imports @mui/icons-material/ArrowRightOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-right-outlined (create-svg-icon (e "path" #js {"d" "m10 17 5-5-5-5v10z"})
                                           "ArrowRightOutlined"))
