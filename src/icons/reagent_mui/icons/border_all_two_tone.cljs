(ns reagent-mui.icons.border-all-two-tone
  "Imports @mui/icons-material/BorderAllTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def border-all-two-tone (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zM11 19H5v-6h6v6zm0-8H5V5h6v6zm8 8h-6v-6h6v6zm0-8h-6V5h6v6z"})
                                          "BorderAllTwoTone"))
