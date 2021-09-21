(ns reagent-mui.icons.navigate-next-outlined
  "Imports @mui/icons-material/NavigateNextOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def navigate-next-outlined (create-svg-icon (e "path" #js {"d" "M10.02 6 8.61 7.41 13.19 12l-4.58 4.59L10.02 18l6-6-6-6z"})
                                             "NavigateNextOutlined"))
