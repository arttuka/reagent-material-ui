(ns reagent-mui.icons.vertical-split-rounded
  "Imports @mui/icons-material/VerticalSplitRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def vertical-split-rounded (create-svg-icon (e "path" #js {"d" "M4 15h6c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zm0 4h6c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zm0-8h6c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1zM3 6c0 .55.45 1 1 1h6c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1zm11-1h6c.55 0 1 .45 1 1v12c0 .55-.45 1-1 1h-6c-.55 0-1-.45-1-1V6c0-.55.45-1 1-1z"})
                                             "VerticalSplitRounded"))
