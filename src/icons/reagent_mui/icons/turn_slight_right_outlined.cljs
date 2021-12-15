(ns reagent-mui.icons.turn-slight-right-outlined
  "Imports @mui/icons-material/TurnSlightRightOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turn-slight-right-outlined (create-svg-icon (e "path" #js {"d" "M12.34 6V4H18v5.66h-2V7.41l-5 5V20H9v-7.58c0-.53.21-1.04.59-1.41l5-5h-2.25z"})
                                                 "TurnSlightRightOutlined"))