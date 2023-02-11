(ns reagent-mui.icons.man-2-rounded
  "Imports @mui/icons-material/Man2Rounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def man-2-rounded (create-svg-icon [(e "path" #js {"d" "M14 7h-4c-1.1 0-2 .9-2 2v5c0 .55.45 1 1 1h1.5v5.5c0 .83.67 1.5 1.5 1.5s1.5-.67 1.5-1.5V15H15c.55 0 1-.45 1-1V9c0-1.1-.9-2-2-2z"}) (e "circle" #js {"cx" "12", "cy" "4", "r" "2"})]
                                    "Man2Rounded"))
