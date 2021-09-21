(ns reagent-mui.icons.filter-hdr-two-tone
  "Imports @mui/icons-material/FilterHdrTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def filter-hdr-two-tone (create-svg-icon [(e "path" #js {"d" "M5 16h3.04l-1.52-2.03z", "opacity" ".3"}) (e "path" #js {"d" "m9.78 11.63 1.25 1.67L14 9.33 19 16h-8.46l-4.01-5.37L1 18h22L14 6l-4.22 5.63zM5 16l1.52-2.03L8.04 16H5z"})]
                                          "FilterHdrTwoTone"))
