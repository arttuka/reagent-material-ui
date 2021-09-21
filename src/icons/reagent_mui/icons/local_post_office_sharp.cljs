(ns reagent-mui.icons.local-post-office-sharp
  "Imports @mui/icons-material/LocalPostOfficeSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def local-post-office-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2.01v16H22V4zm-2 4-8 5-8-5V6l8 5 8-5v2z"})
                                              "LocalPostOfficeSharp"))
