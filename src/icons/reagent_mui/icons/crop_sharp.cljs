(ns reagent-mui.icons.crop-sharp
  "Imports @mui/icons-material/CropSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def crop-sharp (create-svg-icon (e "path" #js {"d" "M17 15h2V5H9v2h8v8zM7 17V1H5v4H1v2h4v12h12v4h2v-4h4v-2H7z"})
                                 "CropSharp"))
