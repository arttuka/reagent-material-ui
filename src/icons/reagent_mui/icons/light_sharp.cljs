(ns reagent-mui.icons.light-sharp
  "Imports @mui/icons-material/LightSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def light-sharp (create-svg-icon (e "path" #js {"d" "M13 6.06V3h-2v3.06C5.87 6.63 2.03 11.51 3.22 17H8c0 2.21 1.79 4 4 4s4-1.79 4-4h4.78A9.0056 9.0056 0 0 0 13 6.06zM12 15H5c0-3.86 3.14-7 7-7s7 3.14 7 7h-7z"})
                                  "LightSharp"))
