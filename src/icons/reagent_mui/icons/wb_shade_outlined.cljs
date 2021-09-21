(ns reagent-mui.icons.wb-shade-outlined
  "Imports @mui/icons-material/WbShadeOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wb-shade-outlined (create-svg-icon (e "path" #js {"d" "M14 12v2.5l5.5 5.5H22l-8-8zm0 8h3l-3-3v3zM8 4l-6 6h2v10h8V10h2L8 4zm1 10H7v-4h2v4z"})
                                        "WbShadeOutlined"))
