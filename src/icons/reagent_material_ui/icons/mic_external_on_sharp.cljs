(ns reagent-material-ui.icons.mic-external-on-sharp
  "Imports @material-ui/icons/MicExternalOnSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def mic-external-on-sharp (create-svg-icon (e "path" #js {"d" "M9.22 7H4.78C4.3 6.47 4 5.77 4 5c0-1.66 1.34-3 3-3s3 1.34 3 3c0 .77-.3 1.47-.78 2zM20 2v20h-2V4h-4v18H6v-4H5L4 8h6L9 18H8v2h4V2h8z"})
                                            "MicExternalOnSharp"))