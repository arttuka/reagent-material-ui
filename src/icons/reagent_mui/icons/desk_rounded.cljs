(ns reagent-mui.icons.desk-rounded
  "Imports @mui/icons-material/DeskRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def desk-rounded (create-svg-icon (e "path" #js {"d" "M2 7v10c0 .55.45 1 1 1s1-.45 1-1V8h10v9c0 .55.45 1 1 1s1-.45 1-1v-1h4v1c0 .55.45 1 1 1s1-.45 1-1V7c0-.55-.45-1-1-1H3c-.55 0-1 .45-1 1zm18 1v2h-4V8h4zm-4 6v-2h4v2h-4z"})
                                   "DeskRounded"))
