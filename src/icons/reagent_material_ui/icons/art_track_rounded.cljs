(ns reagent-material-ui.icons.art-track-rounded
  "Imports @material-ui/icons/ArtTrackRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def art-track-rounded (create-svg-icon (e "path" #js {"d" "M18 19c.55 0 1-.45 1-1V6c0-.55-.45-1-1-1s-1 .45-1 1v12c0 .55.45 1 1 1zm3-13v12c0 .55.45 1 1 1s1-.45 1-1V6c0-.55-.45-1-1-1s-1 .45-1 1zm-8-1H3c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2V7c0-1.1-.9-2-2-2zM4 15l2.12-2.83L7.5 14l1.88-2.5L12 15H4z"})
                                        "ArtTrackRounded"))
