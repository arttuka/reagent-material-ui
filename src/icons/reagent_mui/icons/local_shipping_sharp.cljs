(ns reagent-mui.icons.local-shipping-sharp
  "Imports @mui/icons-material/LocalShippingSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def local-shipping-sharp (create-svg-icon (e "path" #js {"d" "M20 8h-3V4H1v13h2c0 1.66 1.34 3 3 3s3-1.34 3-3h6c0 1.66 1.34 3 3 3s3-1.34 3-3h2v-5l-3-4zM6 18c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm13.5-8.5 1.96 2.5H17V9.5h2.5zM18 18c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z"})
                                           "LocalShippingSharp"))
