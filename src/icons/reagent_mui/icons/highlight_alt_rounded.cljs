(ns reagent-mui.icons.highlight-alt-rounded
  "Imports @mui/icons-material/HighlightAltRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def highlight-alt-rounded (create-svg-icon (e "path" #js {"d" "M17 5h-2V3h2v2zm2 4h2V7h-2v2zm0 4h2v-2h-2v2zm-8 8h2v-2h-2v2zM7 5h2V3H7v2zM3 17h2v-2H3v2zm2 4v-2H3c0 1.1.9 2 2 2zM19 3v2h2c0-1.1-.9-2-2-2zm-8 2h2V3h-2v2zM3 9h2V7H3v2zm4 12h2v-2H7v2zm-4-8h2v-2H3v2zm0-8h2V3c-1.1 0-2 .9-2 2zm15.71 12.29 1.44-1.44c.32-.32.09-.85-.35-.85H16c-.55 0-1 .45-1 1v3.79c0 .45.54.67.85.35l1.44-1.44 2 2c.39.39 1.02.39 1.41 0 .39-.39.39-1.02 0-1.41l-1.99-2z"})
                                            "HighlightAltRounded"))
