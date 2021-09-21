(ns reagent-mui.icons.filter-4-two-tone
  "Imports @mui/icons-material/Filter4TwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def filter-4-two-tone (create-svg-icon [(e "path" #js {"d" "M21 3H7v14h14V3zm-4 12h-2v-4h-4V5h2v4h2V5h2v10z", "opacity" ".3"}) (e "path" #js {"d" "M3 23h16v-2H3V5H1v16c0 1.1.9 2 2 2zm4-4h14c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2H7c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2zM7 3h14v14H7V3zm8 6h-2V5h-2v6h4v4h2V5h-2z"})]
                                        "Filter4TwoTone"))
