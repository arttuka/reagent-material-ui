(ns reagent-mui.icons.forward
  "Imports @mui/icons-material/Forward as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def forward (create-svg-icon (e "path" #js {"d" "M12 8V4l8 8-8 8v-4H4V8z"})
                              "Forward"))
