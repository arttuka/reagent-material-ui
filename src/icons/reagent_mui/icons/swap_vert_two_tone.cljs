(ns reagent-mui.icons.swap-vert-two-tone
  "Imports @mui/icons-material/SwapVertTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def swap-vert-two-tone (create-svg-icon (e "path" #js {"d" "M16 17.01V10h-2v7.01h-3L15 21l4-3.99h-3zM9 3 5 6.99h3V14h2V6.99h3L9 3z"})
                                         "SwapVertTwoTone"))
