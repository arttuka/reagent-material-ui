(ns reagent-mui.icons.publish-two-tone
  "Imports @mui/icons-material/PublishTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def publish-two-tone (create-svg-icon [(e "path" #js {"d" "M9.83 12H11v6h2v-6h1.17L12 9.83z", "opacity" ".3"}) (e "path" #js {"d" "M5 4h14v2H5zm7 3-7 7h4v6h6v-6h4l-7-7zm1 5v6h-2v-6H9.83L12 9.83 14.17 12H13z"})]
                                       "PublishTwoTone"))
