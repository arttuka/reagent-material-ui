(ns reagent-mui.icons.arrow-circle-down-two-tone
  "Imports @mui/icons-material/ArrowCircleDownTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def arrow-circle-down-two-tone (create-svg-icon [(e "path" #js {"d" "M12 4c-4.41 0-8 3.59-8 8s3.59 8 8 8 8-3.59 8-8-3.59-8-8-8zm0 12-4-4h3V8h2v4h3l-4 4z", "opacity" ".3"}) (e "path" #js {"d" "M12 4c4.41 0 8 3.59 8 8s-3.59 8-8 8-8-3.59-8-8 3.59-8 8-8m0-2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm1 10V8h-2v4H8l4 4 4-4h-3z"})]
                                                 "ArrowCircleDownTwoTone"))
