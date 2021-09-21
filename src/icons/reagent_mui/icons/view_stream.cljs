(ns reagent-mui.icons.view-stream
  "Imports @mui/icons-material/ViewStream as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-stream (create-svg-icon (e "path" #js {"d" "M3 17v-2c0-1.1.9-2 2-2h14c1.1 0 2 .9 2 2v2c0 1.1-.9 2-2 2H5c-1.1 0-2-.9-2-2zM3 7v2c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2H5c-1.1 0-2 .9-2 2z"})
                                  "ViewStream"))
