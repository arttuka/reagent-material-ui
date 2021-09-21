(ns reagent-mui.icons.check-box-outline-blank-sharp
  "Imports @mui/icons-material/CheckBoxOutlineBlankSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def check-box-outline-blank-sharp (create-svg-icon (e "path" #js {"d" "M19 5v14H5V5h14m2-2H3v18h18V3z"})
                                                    "CheckBoxOutlineBlankSharp"))
