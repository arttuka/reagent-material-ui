(ns reagent-mui.icons.read-more-sharp
  "Imports @mui/icons-material/ReadMoreSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def read-more-sharp (create-svg-icon (e "path" #js {"d" "M13 7h9v2h-9zm0 8h9v2h-9zm3-4h6v2h-6zm-3 1L8 7v4H2v2h6v4z"})
                                      "ReadMoreSharp"))
