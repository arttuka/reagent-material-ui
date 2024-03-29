(ns reagent-mui.icons.filter-alt-off-two-tone
  "Imports @mui/icons-material/FilterAltOffTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def filter-alt-off-two-tone (create-svg-icon [(e "path" #js {"d" "M8.83 6h8.12l-3.57 4.55z", "opacity" ".3"}) (e "path" #js {"d" "m16.95 6-3.57 4.55 1.43 1.43c1.03-1.31 4.98-6.37 4.98-6.37C20.3 4.95 19.83 4 19 4H6.83l2 2h8.12zM2.81 2.81 1.39 4.22 10 13v6c0 .55.45 1 1 1h2c.55 0 1-.45 1-1v-2.17l5.78 5.78 1.41-1.41L2.81 2.81z"})]
                                              "FilterAltOffTwoTone"))
