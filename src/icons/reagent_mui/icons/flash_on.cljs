(ns reagent-mui.icons.flash-on
  "Imports @mui/icons-material/FlashOn as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def flash-on (create-svg-icon (e "path" #js {"d" "M7 2v11h3v9l7-12h-4l4-8z"})
                               "FlashOn"))
