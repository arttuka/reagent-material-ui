(ns reagent-mui.icons.man-4-sharp
  "Imports @mui/icons-material/Man4Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def man-4-sharp (create-svg-icon [(e "path" #js {"d" "M7.96 7 10 22h4l2.04-15z"}) (e "circle" #js {"cx" "12", "cy" "4", "r" "2"})]
                                  "Man4Sharp"))
