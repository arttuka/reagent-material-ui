(ns reagent-mui.icons.local-cafe-two-tone
  "Imports @mui/icons-material/LocalCafeTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def local-cafe-two-tone (create-svg-icon [(e "path" #js {"d" "M8 15h6c1.1 0 2-.9 2-2V5H6v8c0 1.1.9 2 2 2z", "opacity" ".3"}) (e "path" #js {"d" "M2 19h18v2H2zm2-6c0 2.21 1.79 4 4 4h6c2.21 0 4-1.79 4-4v-3h2c1.11 0 2-.89 2-2V5c0-1.11-.89-2-2-2H4v10zm14-8h2v3h-2V5zM6 5h10v8c0 1.1-.9 2-2 2H8c-1.1 0-2-.9-2-2V5z"})]
                                          "LocalCafeTwoTone"))
