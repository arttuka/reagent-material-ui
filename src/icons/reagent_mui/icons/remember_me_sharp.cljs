(ns reagent-mui.icons.remember-me-sharp
  "Imports @mui/icons-material/RememberMeSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def remember-me-sharp (create-svg-icon [(e "path" #js {"d" "M19 1H5v22h14V1zm-2 14.21c-1.5-.77-3.2-1.21-5-1.21s-3.5.44-5 1.21V6h10v9.21z"}) (e "circle" #js {"cx" "12", "cy" "10", "r" "3"})]
                                        "RememberMeSharp"))
