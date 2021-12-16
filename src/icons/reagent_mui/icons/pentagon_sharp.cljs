(ns reagent-mui.icons.pentagon-sharp
  "Imports @mui/icons-material/PentagonSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def pentagon-sharp (create-svg-icon (e "path" #js {"d" "m2 9 4 12h12l4-12-10-7z"})
                                     "PentagonSharp"))
