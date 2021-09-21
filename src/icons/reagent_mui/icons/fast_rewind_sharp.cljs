(ns reagent-mui.icons.fast-rewind-sharp
  "Imports @mui/icons-material/FastRewindSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def fast-rewind-sharp (create-svg-icon (e "path" #js {"d" "M11 18V6l-8.5 6 8.5 6zm.5-6 8.5 6V6l-8.5 6z"})
                                        "FastRewindSharp"))
