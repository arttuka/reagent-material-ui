(ns reagent-mui.icons.browser-not-supported-sharp
  "Imports @mui/icons-material/BrowserNotSupportedSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def browser-not-supported-sharp (create-svg-icon (e "path" #js {"d" "M19 6v10.5l2 2V4H6.5l2 2zM3.22 3.32 1.95 4.59 3 5.64V20h14.36l2.06 2.06 1.27-1.27L3.22 3.32zM15 18H5V7.64L15.36 18H15z"})
                                                  "BrowserNotSupportedSharp"))
