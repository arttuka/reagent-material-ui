(ns reagent-mui.icons.toc-rounded
  "Imports @mui/icons-material/TocRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def toc-rounded (create-svg-icon (e "path" #js {"d" "M4 9h12c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zm0 4h12c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zm0 4h12c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zm15 0h2v-2h-2v2zm0-10v2h2V7h-2zm0 6h2v-2h-2v2z"})
                                  "TocRounded"))
