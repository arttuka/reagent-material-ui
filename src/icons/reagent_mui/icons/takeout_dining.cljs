(ns reagent-mui.icons.takeout-dining
  "Imports @mui/icons-material/TakeoutDining as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def takeout-dining (create-svg-icon (e "path" #js {"fillRule" "evenodd", "d" "M5.26 11h13.48l-.67 9H5.93l-.67-9zm3.76-7h5.95L19 7.38l1.59-1.59L22 7.21 19.21 10H4.79L2 7.21 3.41 5.8 5 7.38 9.02 4z"})
                                     "TakeoutDining"))
