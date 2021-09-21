(ns reagent-mui.icons.padding-sharp
  "Imports @mui/icons-material/PaddingSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def padding-sharp (create-svg-icon (e "path" #js {"d" "M3 3v18h18V3H3zm6 6H7V7h2v2zm4 0h-2V7h2v2zm4 0h-2V7h2v2z"})
                                    "PaddingSharp"))
