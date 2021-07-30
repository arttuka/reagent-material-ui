(ns reagent-material-ui.icons.sim-card-download-rounded
  "Imports @material-ui/icons/SimCardDownloadRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sim-card-download-rounded (create-svg-icon (e "path" #js {"d" "M18 2h-7.17c-.53 0-1.04.21-1.42.59L4.59 7.41C4.21 7.79 4 8.3 4 8.83V20c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-6.35 14.65-2.79-2.79c-.32-.32-.1-.86.35-.86H11v-2.99c0-.55.44-.99.99-1 .56-.01 1.01.44 1.01 1V13h1.79c.45 0 .67.54.35.85l-2.79 2.79c-.19.2-.51.2-.7.01z"})
                                                "SimCardDownloadRounded"))
