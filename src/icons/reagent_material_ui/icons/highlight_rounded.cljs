(ns reagent-material-ui.icons.highlight-rounded
  "Imports @material-ui/icons/HighlightRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def highlight-rounded (create-svg-icon (e "path" #js {"d" "M6.61 14.59L9.02 17v3c0 1.1.9 2 2 2h2c1.1 0 2-.9 2-2v-3l2.41-2.41c.38-.38.59-.88.59-1.41V10c0-.55-.45-1-1-1h-10c-.55 0-1 .45-1 1v3.17c0 .53.21 1.04.59 1.42zM12.02 2c.56 0 1 .45 1 1v1c0 .55-.45 1-1 1h-.01c-.55 0-1-.45-1-1V3c.01-.55.46-1 1.01-1zM4.2 5.18c.39-.39 1.02-.39 1.41 0l.71.71c.39.39.39 1.02 0 1.41-.39.39-1.02.39-1.41 0l-.71-.72c-.38-.38-.38-1.02 0-1.4zm13.48.7l.71-.71c.39-.39 1.02-.39 1.41 0 .39.39.39 1.02 0 1.41l-.71.71c-.39.39-1.02.39-1.41 0-.39-.38-.39-1.02 0-1.41z"})
                                        "HighlightRounded"))
