(ns reagent-mui.icons.man-rounded
  "Imports @mui/icons-material/ManRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def man-rounded (create-svg-icon [(e "path" #js {"d" "M14 7h-4c-1.1 0-2 .9-2 2v5c0 .55.45 1 1 1h1v6c0 .55.45 1 1 1h2c.55 0 1-.45 1-1v-6h1c.55 0 1-.45 1-1V9c0-1.1-.9-2-2-2z"}) (e "circle" #js {"cx" "12", "cy" "4", "r" "2"})]
                                  "ManRounded"))
