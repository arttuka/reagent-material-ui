(ns reagent-mui.icons.blur-on-two-tone
  "Imports @mui/icons-material/BlurOnTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def blur-on-two-tone (create-svg-icon [(e "circle" #js {"cx" "14", "cy" "10", "r" "1.5"}) (e "circle" #js {"cx" "14", "cy" "18", "r" "1"}) (e "circle" #js {"cx" "14", "cy" "14", "r" "1.5"}) (e "circle" #js {"cx" "14", "cy" "6", "r" "1"}) (e "path" #js {"d" "M3 9.5c-.28 0-.5.22-.5.5s.22.5.5.5.5-.22.5-.5-.22-.5-.5-.5zM14.5 3c0-.28-.22-.5-.5-.5s-.5.22-.5.5.22.5.5.5.5-.22.5-.5zM21 14.5c.28 0 .5-.22.5-.5s-.22-.5-.5-.5-.5.22-.5.5.22.5.5.5z"}) (e "circle" #js {"cx" "18", "cy" "18", "r" "1"}) (e "path" #js {"d" "M13.5 21c0 .28.22.5.5.5s.5-.22.5-.5-.22-.5-.5-.5-.5.22-.5.5zM21 10.5c.28 0 .5-.22.5-.5s-.22-.5-.5-.5-.5.22-.5.5.22.5.5.5z"}) (e "circle" #js {"cx" "18", "cy" "14", "r" "1"}) (e "circle" #js {"cx" "18", "cy" "6", "r" "1"}) (e "circle" #js {"cx" "6", "cy" "18", "r" "1"}) (e "circle" #js {"cx" "6", "cy" "14", "r" "1"}) (e "path" #js {"d" "M3.5 14c0-.28-.22-.5-.5-.5s-.5.22-.5.5.22.5.5.5.5-.22.5-.5z"}) (e "circle" #js {"cx" "10", "cy" "6", "r" "1"}) (e "circle" #js {"cx" "6", "cy" "10", "r" "1"}) (e "circle" #js {"cx" "6", "cy" "6", "r" "1"}) (e "path" #js {"d" "M9.5 21c0 .28.22.5.5.5s.5-.22.5-.5-.22-.5-.5-.5-.5.22-.5.5z"}) (e "circle" #js {"cx" "10", "cy" "18", "r" "1"}) (e "path" #js {"d" "M10.5 3c0-.28-.22-.5-.5-.5s-.5.22-.5.5.22.5.5.5.5-.22.5-.5z"}) (e "circle" #js {"cx" "10", "cy" "14", "r" "1.5"}) (e "circle" #js {"cx" "10", "cy" "10", "r" "1.5"}) (e "circle" #js {"cx" "18", "cy" "10", "r" "1"})]
                                       "BlurOnTwoTone"))
