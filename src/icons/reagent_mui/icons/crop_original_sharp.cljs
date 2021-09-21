(ns reagent-mui.icons.crop-original-sharp
  "Imports @mui/icons-material/CropOriginalSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def crop-original-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-2 16H5V5h14v14zm-5.04-6.71-2.75 3.54-1.96-2.36L6.5 17h11l-3.54-4.71z"})
                                          "CropOriginalSharp"))
