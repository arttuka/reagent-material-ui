(ns reagent-mui.icons.dynamic-feed-sharp
  "Imports @mui/icons-material/DynamicFeedSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def dynamic-feed-sharp (create-svg-icon [(e "path" #js {"d" "M8 8H6v9h11v-2H8z"}) (e "path" #js {"d" "M22 3H10v10h12V3zm-2 8h-8V7h8v4zM4 12H2v9h11v-2H4z"})]
                                         "DynamicFeedSharp"))
