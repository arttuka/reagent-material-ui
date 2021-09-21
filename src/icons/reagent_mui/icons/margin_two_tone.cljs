(ns reagent-mui.icons.margin-two-tone
  "Imports @mui/icons-material/MarginTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def margin-two-tone (create-svg-icon [(e "path" #js {"d" "M5 19h14V5H5v14zM15 7h2v2h-2V7zm0 4h2v2h-2v-2zm-4-4h2v2h-2V7zm0 4h2v2h-2v-2zM7 7h2v2H7V7zm0 4h2v2H7v-2z", "opacity" ".3"}) (e "path" #js {"d" "M7 7h2v2H7zm0 4h2v2H7z"}) (e "path" #js {"d" "M3 3v18h18V3H3zm16 16H5V5h14v14z"}) (e "path" #js {"d" "M11 7h2v2h-2zm4 4h2v2h-2zm-4 0h2v2h-2zm4-4h2v2h-2z"})]
                                      "MarginTwoTone"))
