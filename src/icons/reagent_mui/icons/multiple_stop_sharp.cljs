(ns reagent-mui.icons.multiple-stop-sharp
  "Imports @mui/icons-material/MultipleStopSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def multiple-stop-sharp (create-svg-icon (e "path" #js {"d" "m17 4 4 4-4 4V9h-4V7h4V4zM7 17h4v-2H7v-3l-4 4 4 4v-3zm12-2h-2v2h2v-2zm-4 0h-2v2h2v-2zm-4-8H9v2h2V7zM7 7H5v2h2V7z"})
                                          "MultipleStopSharp"))
