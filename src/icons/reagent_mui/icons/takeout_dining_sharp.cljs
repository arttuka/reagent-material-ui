(ns reagent-mui.icons.takeout-dining-sharp
  "Imports @mui/icons-material/TakeoutDiningSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def takeout-dining-sharp (create-svg-icon (e "path" #js {"d" "m22 7.46-1.41-1.41L19 7.63l.03-.56L14.98 3H9.02L4.97 7.07l.03.5-1.59-1.56L2 7.44 4.66 10h14.69zM5.93 20h12.14l.63-8.45H5.3z"})
                                           "TakeoutDiningSharp"))
