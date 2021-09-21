(ns reagent-mui.icons.web-asset-sharp
  "Imports @mui/icons-material/WebAssetSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def web-asset-sharp (create-svg-icon (e "path" #js {"d" "M3 4v16h18V4H3zm16 14H5V8h14v10z"})
                                      "WebAssetSharp"))
