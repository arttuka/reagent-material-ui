(ns reagent-mui.icons.blur-linear-two-tone
  "Imports @mui/icons-material/BlurLinearTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def blur-linear-two-tone (create-svg-icon [(e "path" #js {"d" "M17 16.5c.28 0 .5-.22.5-.5s-.22-.5-.5-.5-.5.22-.5.5.22.5.5.5z"}) (e "circle" #js {"cx" "9", "cy" "12", "r" "1"}) (e "circle" #js {"cx" "13", "cy" "8", "r" "1"}) (e "circle" #js {"cx" "13", "cy" "16", "r" "1"}) (e "path" #js {"d" "M17 12.5c.28 0 .5-.22.5-.5s-.22-.5-.5-.5-.5.22-.5.5.22.5.5.5z"}) (e "circle" #js {"cx" "13", "cy" "12", "r" "1"}) (e "path" #js {"d" "M3 3h18v2H3z"}) (e "circle" #js {"cx" "5", "cy" "8", "r" "1.5"}) (e "circle" #js {"cx" "5", "cy" "12", "r" "1.5"}) (e "circle" #js {"cx" "5", "cy" "16", "r" "1.5"}) (e "path" #js {"d" "M17 8.5c.28 0 .5-.22.5-.5s-.22-.5-.5-.5-.5.22-.5.5.22.5.5.5z"}) (e "circle" #js {"cx" "9", "cy" "16", "r" "1"}) (e "circle" #js {"cx" "9", "cy" "8", "r" "1"}) (e "path" #js {"d" "M3 19h18v2H3z"})]
                                           "BlurLinearTwoTone"))
