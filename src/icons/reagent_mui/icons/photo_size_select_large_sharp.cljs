(ns reagent-mui.icons.photo-size-select-large-sharp
  "Imports @mui/icons-material/PhotoSizeSelectLargeSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def photo-size-select-large-sharp (create-svg-icon (e "path" #js {"d" "M21 15h2v2h-2v-2zm0 4h2v2h-2v-2zm0-8h2v2h-2v-2zm-8-8h2v2h-2V3zm8 4h2v2h-2V7zM1 7h2v2H1V7zm16-4h2v2h-2V3zm0 16h2v2h-2v-2zM3 3H1v2h2V3zm20 0h-2v2h2V3zM9 3h2v2H9V3zM5 3h2v2H5V3zm-4 8v10h14V11H1zm2 8 2.5-3.21 1.79 2.15 2.5-3.22L13 19H3z"})
                                                    "PhotoSizeSelectLargeSharp"))
