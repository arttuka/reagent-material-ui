(ns reagent-mui.icons.villa-rounded
  "Imports @mui/icons-material/VillaRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def villa-rounded (create-svg-icon (e "path" #js {"d" "M7 21H4c-.55 0-1-.45-1-1V8.69c0-.42.25-.79.64-.94l11-4.23c.66-.25 1.36.23 1.36.94V10H8c-.55 0-1 .45-1 1v10zm10-9h-7c-.55 0-1 .45-1 1v7c0 .55.45 1 1 1h4v-4c0-.55.45-1 1-1s1 .45 1 1v4h4c.55 0 1-.45 1-1v-8c0-1.1-.9-2-2-2s-2 .9-2 2z"})
                                    "VillaRounded"))
