(ns reagent-material-ui.icons.upgrade-rounded
  "Imports @material-ui/icons/UpgradeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def upgrade-rounded (create-svg-icon (e "path" #js {"d" "M16 19c0 .55-.45 1-1 1H9c-.55 0-1-.45-1-1s.45-1 1-1h6c.55 0 1 .45 1 1zM11 7.99V15c0 .55.45 1 1 1s1-.45 1-1V7.99h1.79c.45 0 .67-.54.35-.85l-2.79-2.78c-.2-.19-.51-.19-.71 0L8.86 7.14c-.32.31-.1.85.35.85H11z"})
                                      "UpgradeRounded"))
