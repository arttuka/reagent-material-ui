(ns reagent-material-ui.icons.volume-mute-rounded
  "Imports @material-ui/icons/VolumeMuteRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def volume-mute-rounded (create-svg-icon (e "path" #js {"d" "M7 10v4c0 .55.45 1 1 1h3l3.29 3.29c.63.63 1.71.18 1.71-.71V6.41c0-.89-1.08-1.34-1.71-.71L11 9H8c-.55 0-1 .45-1 1z"})
                                          "VolumeMuteRounded"))
