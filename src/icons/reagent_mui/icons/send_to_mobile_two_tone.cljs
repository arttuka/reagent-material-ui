(ns reagent-mui.icons.send-to-mobile-two-tone
  "Imports @mui/icons-material/SendToMobileTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def send-to-mobile-two-tone (create-svg-icon [(e "path" #js {"d" "M7 3h10v1H7zm0 17h10v1H7z", "opacity" ".3"}) (e "path" #js {"d" "m22 12-4-4v3h-5v2h5v3l4-4zm-5 6H7V6h10v1h2V3c0-1.1-.9-2-2-2L7 1.01C5.9 1.01 5 1.9 5 3v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2v-4h-2v1zM7 3h10v1H7V3zm10 18H7v-1h10v1z"})]
                                              "SendToMobileTwoTone"))
