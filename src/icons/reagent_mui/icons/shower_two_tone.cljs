(ns reagent-mui.icons.shower-two-tone
  "Imports @mui/icons-material/ShowerTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def shower-two-tone (create-svg-icon [(e "path" #js {"d" "M12 7c-2.76 0-5 2.24-5 5h10c0-2.76-2.24-5-5-5z", "opacity" ".3"}) (e "circle" #js {"cx" "8", "cy" "20", "r" "1"}) (e "circle" #js {"cx" "16", "cy" "17", "r" "1"}) (e "path" #js {"d" "M13 5.08V3h-2v2.08C7.61 5.57 5 8.47 5 12v2h14v-2c0-3.53-2.61-6.43-6-6.92zM7 12c0-2.76 2.24-5 5-5s5 2.24 5 5H7z"}) (e "circle" #js {"cx" "16", "cy" "20", "r" "1"}) (e "circle" #js {"cx" "12", "cy" "17", "r" "1"}) (e "circle" #js {"cx" "8", "cy" "17", "r" "1"}) (e "circle" #js {"cx" "12", "cy" "20", "r" "1"})]
                                      "ShowerTwoTone"))
