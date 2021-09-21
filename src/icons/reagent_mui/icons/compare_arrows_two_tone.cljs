(ns reagent-mui.icons.compare-arrows-two-tone
  "Imports @mui/icons-material/CompareArrowsTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def compare-arrows-two-tone (create-svg-icon (e "path" #js {"d" "M9.01 14H2v2h7.01v3L13 15l-3.99-4v3zm5.98-1v-3H22V8h-7.01V5L11 9l3.99 4z"})
                                              "CompareArrowsTwoTone"))
