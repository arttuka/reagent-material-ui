(ns reagent-mui.icons.local-bar-two-tone
  "Imports @mui/icons-material/LocalBarTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def local-bar-two-tone (create-svg-icon [(e "path" #js {"d" "M9.23 9 12 12.11 14.77 9z", "opacity" ".3"}) (e "path" #js {"d" "M21 5V3H3v2l8 9v5H6v2h12v-2h-5v-5l8-9zM5.66 5h12.69l-1.78 2H7.43L5.66 5zM12 12.11 9.23 9h5.54L12 12.11z"})]
                                         "LocalBarTwoTone"))
