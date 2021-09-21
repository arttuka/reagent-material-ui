(ns reagent-mui.icons.vertical-align-top-outlined
  "Imports @mui/icons-material/VerticalAlignTopOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def vertical-align-top-outlined (create-svg-icon (e "path" #js {"d" "M8 11h3v10h2V11h3l-4-4-4 4zM4 3v2h16V3H4z"})
                                                  "VerticalAlignTopOutlined"))
