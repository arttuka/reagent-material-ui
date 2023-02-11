(ns reagent-mui.icons.face-6-sharp
  "Imports @mui/icons-material/Face6Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def face-6-sharp (create-svg-icon [(e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8h2.62l2-4h6.76l2 4H20c0 4.41-3.59 8-8 8z"}) (e "circle" #js {"cx" "9", "cy" "13", "r" "1.25"}) (e "circle" #js {"cx" "15", "cy" "13", "r" "1.25"})]
                                   "Face6Sharp"))
