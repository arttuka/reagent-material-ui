(ns reagent-mui.icons.gite-two-tone
  "Imports @mui/icons-material/GiteTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def gite-two-tone (create-svg-icon [(e "path" #js {"d" "M4 12h10v5H4v-5zm16 5h-4v-6.17l2-2 2 2V17z", "opacity" ".3"}) (e "path" #js {"d" "M18 6H9V4H7v2H6l-4 4v9h20v-9l-4-4zM4 12h10v5H4v-5zm16 5h-4v-6.17l2-2 2 2V17z"})]
                                    "GiteTwoTone"))
