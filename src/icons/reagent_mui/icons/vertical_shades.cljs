(ns reagent-mui.icons.vertical-shades
  "Imports @mui/icons-material/VerticalShades as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def vertical-shades (create-svg-icon (e "path" #js {"d" "M20 19V3H4v16H2v2h20v-2h-2zm-10 0V5h4v14h-4z"})
                                      "VerticalShades"))
