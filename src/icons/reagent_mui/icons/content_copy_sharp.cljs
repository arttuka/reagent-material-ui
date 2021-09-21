(ns reagent-mui.icons.content-copy-sharp
  "Imports @mui/icons-material/ContentCopySharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def content-copy-sharp (create-svg-icon (e "path" #js {"d" "M16 1H2v16h2V3h12V1zm5 4H6v18h15V5zm-2 16H8V7h11v14z"})
                                         "ContentCopySharp"))
