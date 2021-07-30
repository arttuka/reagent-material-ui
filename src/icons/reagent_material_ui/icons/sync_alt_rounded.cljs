(ns reagent-material-ui.icons.sync-alt-rounded
  "Imports @material-ui/icons/SyncAltRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sync-alt-rounded (create-svg-icon (e "path" #js {"d" "m21.65 7.65-2.79-2.79c-.32-.32-.86-.1-.86.35V7H4c-.55 0-1 .45-1 1s.45 1 1 1h14v1.79c0 .45.54.67.85.35l2.79-2.79c.2-.19.2-.51.01-.7zm-19.3 8.7 2.79 2.79c.32.32.86.1.86-.35V17h14c.55 0 1-.45 1-1s-.45-1-1-1H6v-1.79c0-.45-.54-.67-.85-.35l-2.79 2.79c-.2.19-.2.51-.01.7z"})
                                       "SyncAltRounded"))
