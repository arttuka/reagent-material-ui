(ns reagent-mui.icons.crop-54-sharp
  "Imports @mui/icons-material/Crop54Sharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def crop-54-sharp (create-svg-icon (e "path" #js {"d" "M21 4H3v16h18V4zm-2 14H5V6h14v12z"})
                                    "Crop54Sharp"))
