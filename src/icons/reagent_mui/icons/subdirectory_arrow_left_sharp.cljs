(ns reagent-mui.icons.subdirectory-arrow-left-sharp
  "Imports @mui/icons-material/SubdirectoryArrowLeftSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def subdirectory-arrow-left-sharp (create-svg-icon (e "path" #js {"d" "m11 9 1.42 1.42L8.83 14H18V4h2v12H8.83l3.59 3.58L11 21l-6-6 6-6z"})
                                                    "SubdirectoryArrowLeftSharp"))
