(ns reagent-mui.icons.wb-incandescent-sharp
  "Imports @mui/icons-material/WbIncandescentSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wb-incandescent-sharp (create-svg-icon (e "path" #js {"d" "m3.55 19.09 1.41 1.41 1.79-1.8-1.41-1.41-1.79 1.8zM11 23h2v-2.95h-2V23zM4 11.05H1v2h3v-2zm11-4.19V2.05H9v4.81C7.21 7.9 6 9.83 6 12.05c0 3.31 2.69 6 6 6s6-2.69 6-6c0-2.22-1.21-4.15-3-5.19zm5 4.19v2h3v-2h-3zm-2.76 7.66 1.79 1.8 1.41-1.41-1.8-1.79-1.4 1.4z"})
                                            "WbIncandescentSharp"))
