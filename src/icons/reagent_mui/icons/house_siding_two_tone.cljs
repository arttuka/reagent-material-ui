(ns reagent-mui.icons.house-siding-two-tone
  "Imports @mui/icons-material/HouseSidingTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def house-siding-two-tone (create-svg-icon [(e "path" #js {"d" "M7.21 10h9.58l.21.19V12H7v-1.81l.21-.19zm7.36-2H9.43L12 5.69 14.57 8zM7 16v-2h10v2H7z", "opacity" ".3"}) (e "path" #js {"d" "M19 12h3L12 3 2 12h3v8h2v-2h10v2h2v-8zM7.21 10h9.58l.21.19V12H7v-1.81l.21-.19zm7.36-2H9.43L12 5.69 14.57 8zM7 16v-2h10v2H7z"})]
                                            "HouseSidingTwoTone"))
