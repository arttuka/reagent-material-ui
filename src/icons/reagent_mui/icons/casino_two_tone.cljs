(ns reagent-mui.icons.casino-two-tone
  "Imports @mui/icons-material/CasinoTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def casino-two-tone (create-svg-icon [(e "path" #js {"d" "M5 19h14V5H5v14zM16.5 6c.83 0 1.5.67 1.5 1.5S17.33 9 16.5 9 15 8.33 15 7.5 15.67 6 16.5 6zm0 9c.83 0 1.5.67 1.5 1.5s-.67 1.5-1.5 1.5-1.5-.67-1.5-1.5.67-1.5 1.5-1.5zM12 10.5c.83 0 1.5.67 1.5 1.5s-.67 1.5-1.5 1.5-1.5-.67-1.5-1.5.67-1.5 1.5-1.5zM7.5 6C8.33 6 9 6.67 9 7.5S8.33 9 7.5 9 6 8.33 6 7.5 6.67 6 7.5 6zm0 9c.83 0 1.5.67 1.5 1.5S8.33 18 7.5 18 6 17.33 6 16.5 6.67 15 7.5 15z", "opacity" ".3"}) (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 16H5V5h14v14z"}) (e "circle" #js {"cx" "7.5", "cy" "16.5", "r" "1.5"}) (e "circle" #js {"cx" "7.5", "cy" "7.5", "r" "1.5"}) (e "circle" #js {"cx" "12", "cy" "12", "r" "1.5"}) (e "circle" #js {"cx" "16.5", "cy" "16.5", "r" "1.5"}) (e "circle" #js {"cx" "16.5", "cy" "7.5", "r" "1.5"})]
                                      "CasinoTwoTone"))
