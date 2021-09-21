(ns reagent-mui.icons.vertical-split-two-tone
  "Imports @mui/icons-material/VerticalSplitTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def vertical-split-two-tone (create-svg-icon [(e "path" #js {"d" "M15 7h4v10h-4z", "opacity" ".3"}) (e "path" #js {"d" "M3 13h8v2H3zm0 4h8v2H3zm0-8h8v2H3zm0-4h8v2H3zm10 0v14h8V5h-8zm6 12h-4V7h4v10z"})]
                                              "VerticalSplitTwoTone"))
