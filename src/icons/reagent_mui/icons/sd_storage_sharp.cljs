(ns reagent-mui.icons.sd-storage-sharp
  "Imports @mui/icons-material/SdStorageSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sd-storage-sharp (create-svg-icon (e "path" #js {"d" "M20 2H10L4 8v14h16V2zm-8 6h-2V4h2v4zm3 0h-2V4h2v4zm3 0h-2V4h2v4z"})
                                       "SdStorageSharp"))
