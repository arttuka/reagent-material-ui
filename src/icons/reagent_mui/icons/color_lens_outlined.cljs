(ns reagent-mui.icons.color-lens-outlined
  "Imports @mui/icons-material/ColorLensOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def color-lens-outlined (create-svg-icon [(e "path" #js {"d" "M12 22C6.49 22 2 17.51 2 12S6.49 2 12 2s10 4.04 10 9c0 3.31-2.69 6-6 6h-1.77c-.28 0-.5.22-.5.5 0 .12.05.23.13.33.41.47.64 1.06.64 1.67 0 1.38-1.12 2.5-2.5 2.5zm0-18c-4.41 0-8 3.59-8 8s3.59 8 8 8c.28 0 .5-.22.5-.5 0-.16-.08-.28-.14-.35-.41-.46-.63-1.05-.63-1.65 0-1.38 1.12-2.5 2.5-2.5H16c2.21 0 4-1.79 4-4 0-3.86-3.59-7-8-7z"}) (e "circle" #js {"cx" "6.5", "cy" "11.5", "r" "1.5"}) (e "circle" #js {"cx" "9.5", "cy" "7.5", "r" "1.5"}) (e "circle" #js {"cx" "14.5", "cy" "7.5", "r" "1.5"}) (e "circle" #js {"cx" "17.5", "cy" "11.5", "r" "1.5"})]
                                          "ColorLensOutlined"))
