(ns reagent-mui.icons.line-weight
  "Imports @mui/icons-material/LineWeight as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def line-weight (create-svg-icon (e "path" #js {"d" "M3 17h18v-2H3v2zm0 3h18v-1H3v1zm0-7h18v-3H3v3zm0-9v4h18V4H3z"})
                                  "LineWeight"))
