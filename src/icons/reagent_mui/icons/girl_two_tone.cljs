(ns reagent-mui.icons.girl-two-tone
  "Imports @mui/icons-material/GirlTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def girl-two-tone (create-svg-icon (e "path" #js {"d" "M12 7.5c.97 0 1.75-.78 1.75-1.75S12.97 4 12 4s-1.75.78-1.75 1.75S11.03 7.5 12 7.5zm2 8.5v4h-4v-4H8l2.38-6.38c.25-.67.9-1.12 1.62-1.12s1.37.45 1.62 1.12L16 16h-2z"})
                                    "GirlTwoTone"))
