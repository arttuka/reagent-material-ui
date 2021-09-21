(ns reagent-mui.icons.looks-one-sharp
  "Imports @mui/icons-material/LooksOneSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def looks-one-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-7 14h-2V9h-2V7h4v10z"})
                                      "LooksOneSharp"))
