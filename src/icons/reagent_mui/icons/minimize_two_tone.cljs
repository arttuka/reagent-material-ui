(ns reagent-mui.icons.minimize-two-tone
  "Imports @mui/icons-material/MinimizeTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def minimize-two-tone (create-svg-icon (e "path" #js {"d" "M6 19h12v2H6v-2z"})
                                        "MinimizeTwoTone"))
