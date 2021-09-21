(ns reagent-mui.icons.circle-two-tone
  "Imports @mui/icons-material/CircleTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def circle-two-tone (create-svg-icon [(e "circle" #js {"cx" "12", "cy" "12", "r" "8", "opacity" ".3"}) (e "path" #js {"d" "M12 2C6.47 2 2 6.47 2 12s4.47 10 10 10 10-4.47 10-10S17.53 2 12 2zm0 18c-4.42 0-8-3.58-8-8s3.58-8 8-8 8 3.58 8 8-3.58 8-8 8z"})]
                                      "CircleTwoTone"))
