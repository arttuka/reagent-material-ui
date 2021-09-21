(ns reagent-mui.icons.mms-sharp
  "Imports @mui/icons-material/MmsSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mms-sharp (create-svg-icon (e "path" #js {"d" "M22 2H2v20l4-4h16V2zM5 14l3.5-4.5 2.5 3.01L14.5 8l4.5 6H5z"})
                                "MmsSharp"))
