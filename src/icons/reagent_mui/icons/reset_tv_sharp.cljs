(ns reagent-mui.icons.reset-tv-sharp
  "Imports @mui/icons-material/ResetTvSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def reset-tv-sharp (create-svg-icon (e "path" #js {"d" "M22 10h-9.01V7L9 11l3.99 4v-3H20v5H4V5h16v3h2V3H2v16h6v2h8v-2h6z"})
                                     "ResetTvSharp"))
