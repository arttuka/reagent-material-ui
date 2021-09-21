(ns reagent-mui.icons.thumbs-up-down-sharp
  "Imports @mui/icons-material/ThumbsUpDownSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def thumbs-up-down-sharp (create-svg-icon (e "path" #js {"d" "M12 5H5.82l.78-3.78L5.38 0 0 5.38V14h9.24L12 7.54zm2.76 5L12 16.46V19h6.18l-.78 3.78L18.62 24 24 18.62V10z"})
                                           "ThumbsUpDownSharp"))
