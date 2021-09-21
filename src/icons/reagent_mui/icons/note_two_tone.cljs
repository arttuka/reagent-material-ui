(ns reagent-mui.icons.note-two-tone
  "Imports @mui/icons-material/NoteTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def note-two-tone (create-svg-icon [(e "path" #js {"d" "M15 6H4v12.01h16V11h-5z", "opacity" ".3"}) (e "path" #js {"d" "M4 4c-1.1 0-2 .9-2 2v12.01c0 1.1.9 1.99 2 1.99h16c1.1 0 2-.9 2-2v-8l-6-6H4zm16 14.01H4V6h11v5h5v7.01z"})]
                                    "NoteTwoTone"))
