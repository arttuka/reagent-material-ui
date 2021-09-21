(ns reagent-mui.icons.content-copy-two-tone
  "Imports @mui/icons-material/ContentCopyTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def content-copy-two-tone (create-svg-icon [(e "path" #js {"d" "M8 7h11v14H8z", "opacity" ".3"}) (e "path" #js {"d" "M16 1H4c-1.1 0-2 .9-2 2v14h2V3h12V1zm3 4H8c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h11c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2zm0 16H8V7h11v14z"})]
                                            "ContentCopyTwoTone"))
