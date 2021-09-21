(ns reagent-mui.icons.skip-previous-sharp
  "Imports @mui/icons-material/SkipPreviousSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def skip-previous-sharp (create-svg-icon (e "path" #js {"d" "M6 6h2v12H6V6zm3.5 6 8.5 6V6l-8.5 6z"})
                                          "SkipPreviousSharp"))
