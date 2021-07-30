(ns reagent-material-ui.icons.subtitles-off-outlined
  "Imports @material-ui/icons/SubtitlesOffOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def subtitles-off-outlined (create-svg-icon [(e "path" #js {"d" "M20 4H6.83l2 2H20v11.17l1.76 1.76c.15-.28.24-.59.24-.93V6c0-1.1-.9-2-2-2z"}) (e "path" #js {"d" "M18 10h-5.17l2 2H18zM1.04 3.87l1.2 1.2C2.09 5.35 2 5.66 2 6v12c0 1.1.9 2 2 2h13.17l2.96 2.96 1.41-1.41L2.45 2.45 1.04 3.87zM4 6.83 7.17 10H6v2h2v-1.17L11.17 14H6v2h7.17l2 2H4V6.83z"})]
                                             "SubtitlesOffOutlined"))
