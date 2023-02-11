(ns reagent-mui.icons.man-4
  "Imports @mui/icons-material/Man4 as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def man-4 (create-svg-icon [(e "path" #js {"d" "M13.75 7h-3.5C9.04 7 8.11 8.07 8.27 9.26L10 22h4l1.73-12.74C15.89 8.07 14.96 7 13.75 7z"}) (e "circle" #js {"cx" "12", "cy" "4", "r" "2"})]
                            "Man4"))
