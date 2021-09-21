(ns reagent-mui.icons.wb-iridescent
  "Imports @mui/icons-material/WbIridescent as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wb-iridescent (create-svg-icon (e "path" #js {"d" "M5 14.5h14v-6H5v6zM11 .55V3.5h2V.55h-2zm8.04 2.5-1.79 1.79 1.41 1.41 1.8-1.79-1.42-1.41zM13 22.45V19.5h-2v2.95h2zm7.45-3.91-1.8-1.79-1.41 1.41 1.79 1.8 1.42-1.42zM3.55 4.46l1.79 1.79 1.41-1.41-1.79-1.79-1.41 1.41zm1.41 15.49 1.79-1.8-1.41-1.41-1.79 1.79 1.41 1.42z"})
                                    "WbIridescent"))
