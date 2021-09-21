(ns reagent-mui.icons.arrow-left
  "Imports @mui/icons-material/ArrowLeft as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-left (create-svg-icon (e "path" #js {"d" "m14 7-5 5 5 5V7z"})
                                 "ArrowLeft"))
