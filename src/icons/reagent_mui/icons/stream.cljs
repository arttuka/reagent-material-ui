(ns reagent-mui.icons.stream
  "Imports @mui/icons-material/Stream as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def stream (create-svg-icon [(e "circle" #js {"cx" "20", "cy" "12", "r" "2"}) (e "circle" #js {"cx" "4", "cy" "12", "r" "2"}) (e "circle" #js {"cx" "12", "cy" "20", "r" "2"}) (e "path" #js {"d" "M10.05 8.59 6.03 4.55h-.01l-.31-.32-1.42 1.41 4.02 4.05.01-.01.31.32zm3.893.027 4.405-4.392L19.76 5.64l-4.405 4.393zM10.01 15.36l-1.42-1.41-4.03 4.01-.32.33 1.41 1.41 4.03-4.02zm9.75 2.94-3.99-4.01-.36-.35L14 15.35l3.99 4.01.35.35z"}) (e "circle" #js {"cx" "12", "cy" "4", "r" "2"})]
                             "Stream"))
