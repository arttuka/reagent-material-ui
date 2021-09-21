(ns reagent-mui.icons.expand-two-tone
  "Imports @mui/icons-material/ExpandTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def expand-two-tone (create-svg-icon (e "path" #js {"d" "M4 20h16v2H4v-2zM4 2h16v2H4V2zm9 7h3l-4-4-4 4h3v6H8l4 4 4-4h-3V9z"})
                                      "ExpandTwoTone"))
