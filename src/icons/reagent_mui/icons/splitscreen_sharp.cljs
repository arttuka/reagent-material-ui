(ns reagent-mui.icons.splitscreen-sharp
  "Imports @mui/icons-material/SplitscreenSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def splitscreen-sharp (create-svg-icon (e "path" #js {"d" "M18 4v5H6V4h12m2-2H4v9h16V2zm-2 13v5H6v-5h12m2-2H4v9h16v-9z"})
                                        "SplitscreenSharp"))
