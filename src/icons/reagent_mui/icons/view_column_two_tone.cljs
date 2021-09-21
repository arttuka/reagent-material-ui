(ns reagent-mui.icons.view-column-two-tone
  "Imports @mui/icons-material/ViewColumnTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-column-two-tone (create-svg-icon [(e "path" #js {"d" "M8.33 17H5V7h3.33v10zm5.34 0h-3.33V7h3.33v10zM19 17h-3.33V7H19v10z", "opacity" ".3"}) (e "path" #js {"d" "M3 5v14h18V5H3zm5.33 12H5V7h3.33v10zm5.34 0h-3.33V7h3.33v10zM19 17h-3.33V7H19v10z"})]
                                           "ViewColumnTwoTone"))
