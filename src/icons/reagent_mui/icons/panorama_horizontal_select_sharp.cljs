(ns reagent-mui.icons.panorama-horizontal-select-sharp
  "Imports @mui/icons-material/PanoramaHorizontalSelectSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def panorama-horizontal-select-sharp (create-svg-icon (e "path" #js {"d" "M12 5.5c-5.25 0-9.01-1.54-10-1.92V20.4c2.16-.76 5.21-1.9 10-1.9 4.78 0 7.91 1.17 10 1.9V3.6c-2.09.73-5.23 1.9-10 1.9z"})
                                                       "PanoramaHorizontalSelectSharp"))
