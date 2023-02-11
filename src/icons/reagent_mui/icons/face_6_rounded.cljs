(ns reagent-mui.icons.face-6-rounded
  "Imports @mui/icons-material/Face6Rounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def face-6-rounded (create-svg-icon [(e "path" #js {"d" "M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10 10-4.48 10-10S17.52 2 12 2zm0 18c-4.41 0-8-3.59-8-8v-.03c2.31-.22 3.43-1.59 4.34-3.41.17-.35.51-.56.9-.56h5.53c.38 0 .72.21.89.55.9 1.8 1.99 3.19 4.34 3.41v.03c0 4.42-3.59 8.01-8 8.01z"}) (e "circle" #js {"cx" "9", "cy" "13", "r" "1.25"}) (e "circle" #js {"cx" "15", "cy" "13", "r" "1.25"})]
                                     "Face6Rounded"))
