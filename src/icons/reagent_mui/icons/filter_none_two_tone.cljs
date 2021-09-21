(ns reagent-mui.icons.filter-none-two-tone
  "Imports @mui/icons-material/FilterNoneTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def filter-none-two-tone (create-svg-icon [(e "path" #js {"d" "M7 3h14v14H7z", "opacity" ".3"}) (e "path" #js {"d" "M3 23h16v-2H3V5H1v16c0 1.1.9 2 2 2zM21 1H7c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zm0 16H7V3h14v14z"})]
                                           "FilterNoneTwoTone"))
