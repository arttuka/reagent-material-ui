(ns reagent-mui.icons.drafts-sharp
  "Imports @mui/icons-material/DraftsSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def drafts-sharp (create-svg-icon (e "path" #js {"d" "M21.99 6.86 12 1 2 6.86V20h20l-.01-13.14zM12 13 3.74 7.84 12 3l8.26 4.84L12 13z"})
                                   "DraftsSharp"))
