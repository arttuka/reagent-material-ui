(ns reagent-mui.icons.deblur-outlined
  "Imports @mui/icons-material/DeblurOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def deblur-outlined (create-svg-icon [(e "circle" #js {"cx" "6", "cy" "14", "r" "1"}) (e "circle" #js {"cx" "6", "cy" "18", "r" "1"}) (e "circle" #js {"cx" "6", "cy" "10", "r" "1"}) (e "circle" #js {"cx" "3", "cy" "10", "r" ".5"}) (e "circle" #js {"cx" "6", "cy" "6", "r" "1"}) (e "circle" #js {"cx" "3", "cy" "14", "r" ".5"}) (e "circle" #js {"cx" "10", "cy" "21", "r" ".5"}) (e "circle" #js {"cx" "10", "cy" "3", "r" ".5"}) (e "circle" #js {"cx" "10", "cy" "6", "r" "1"}) (e "circle" #js {"cx" "10", "cy" "14", "r" "1.5"}) (e "circle" #js {"cx" "10", "cy" "10", "r" "1.5"}) (e "circle" #js {"cx" "10", "cy" "18", "r" "1"}) (e "path" #js {"d" "M12 3v2c3.86 0 7 3.14 7 7s-3.14 7-7 7v2c4.96 0 9-4.04 9-9s-4.04-9-9-9z"})]
                                      "DeblurOutlined"))
