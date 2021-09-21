(ns reagent-mui.icons.splitscreen-two-tone
  "Imports @mui/icons-material/SplitscreenTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def splitscreen-two-tone (create-svg-icon [(e "path" #js {"d" "M6 4h12v5H6zm0 11h12v5H6z", "opacity" ".3"}) (e "path" #js {"d" "M18 2H6c-1.1 0-2 .9-2 2v5c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm0 7H6V4h12v5zm0 4H6c-1.1 0-2 .9-2 2v5c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2v-5c0-1.1-.9-2-2-2zm0 7H6v-5h12v5z"})]
                                           "SplitscreenTwoTone"))
