(ns reagent-material-ui.icons.bungalow-rounded
  "Imports @material-ui/icons/BungalowRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def bungalow-rounded (create-svg-icon (e "path" #js {"d" "M12 16c.55 0 1 .45 1 1v4h3c.55 0 1-.45 1-1v-5.21l.57.92c.29.47.91.61 1.38.32.47-.29.61-.91.32-1.38L12.85 4.36c-.39-.63-1.31-.63-1.7 0L4.73 14.65c-.29.47-.15 1.09.32 1.38.47.29 1.08.15 1.38-.32L7 14.8V20c0 .55.45 1 1 1h3v-4c0-.55.45-1 1-1zm1-3c0 .55-.45 1-1 1s-1-.45-1-1 .45-1 1-1 1 .45 1 1z"})
                                       "BungalowRounded"))
