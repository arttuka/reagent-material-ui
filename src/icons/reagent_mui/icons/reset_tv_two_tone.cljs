(ns reagent-mui.icons.reset-tv-two-tone
  "Imports @mui/icons-material/ResetTvTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def reset-tv-two-tone (create-svg-icon (e "path" #js {"d" "M20 10h-7.01V7L9 11l3.99 4v-3H20v5H4V5h16v3h2V5c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h4v2h8v-2h4c1.1 0 1.99-.9 1.99-2v-5H22c0-1.1-.9-2-2-2z"})
                                        "ResetTvTwoTone"))
