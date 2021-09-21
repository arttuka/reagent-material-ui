(ns reagent-mui.icons.skip-previous-outlined
  "Imports @mui/icons-material/SkipPreviousOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def skip-previous-outlined (create-svg-icon (e "path" #js {"d" "M6 6h2v12H6zm3.5 6 8.5 6V6l-8.5 6zm6.5 2.14L12.97 12 16 9.86v4.28z"})
                                             "SkipPreviousOutlined"))
