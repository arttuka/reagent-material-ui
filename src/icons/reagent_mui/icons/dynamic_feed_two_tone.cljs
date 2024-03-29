(ns reagent-mui.icons.dynamic-feed-two-tone
  "Imports @mui/icons-material/DynamicFeedTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def dynamic-feed-two-tone (create-svg-icon [(e "path" #js {"d" "M12 7h8v4h-8z", "opacity" ".3"}) (e "path" #js {"d" "M8 8H6v7c0 1.1.9 2 2 2h9v-2H8V8z"}) (e "path" #js {"d" "M20 3h-8c-1.1 0-2 .9-2 2v6c0 1.1.9 2 2 2h8c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 8h-8V7h8v4zM4 12H2v7c0 1.1.9 2 2 2h9v-2H4v-7z"})]
                                            "DynamicFeedTwoTone"))
