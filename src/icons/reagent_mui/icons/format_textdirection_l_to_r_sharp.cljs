(ns reagent-mui.icons.format-textdirection-l-to-r-sharp
  "Imports @mui/icons-material/FormatTextdirectionLToRSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def format-textdirection-l-to-r-sharp (create-svg-icon (e "path" #js {"d" "M9 10v5h2V4h2v11h2V4h2V2H9C6.79 2 5 3.79 5 6s1.79 4 4 4zm12 8-4-4v3H5v2h12v3l4-4z"})
                                                        "FormatTextdirectionLToRSharp"))
