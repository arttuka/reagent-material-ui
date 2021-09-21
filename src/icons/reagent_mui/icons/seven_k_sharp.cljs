(ns reagent-mui.icons.seven-k-sharp
  "Imports @mui/icons-material/SevenKSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def seven-k-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zM9.5 15H7.75l1.38-4.5H6.5V9h4.86L9.5 15zm8.5 0h-1.75l-1.75-2.25V15H13V9h1.5v2.25L16.25 9H18l-2.25 3L18 15z"})
                                    "SevenKSharp"))
