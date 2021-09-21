(ns reagent-mui.icons.panorama-two-tone
  "Imports @mui/icons-material/PanoramaTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def panorama-two-tone (create-svg-icon [(e "path" #js {"d" "M3 18h18V6H3v12zm5.5-5.5 2.5 3.01L14.5 11l4.5 6H5l3.5-4.5z", "opacity" ".3"}) (e "path" #js {"d" "M21 4H3c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 14H3V6h18v12zm-6.5-7L11 15.51 8.5 12.5 5 17h14z"})]
                                        "PanoramaTwoTone"))
