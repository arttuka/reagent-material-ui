(ns reagent-mui.icons.flash-on-outlined
  "Imports @mui/icons-material/FlashOnOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def flash-on-outlined (create-svg-icon (e "path" #js {"d" "M7 2v11h3v9l7-12h-4l3-8z"})
                                        "FlashOnOutlined"))
