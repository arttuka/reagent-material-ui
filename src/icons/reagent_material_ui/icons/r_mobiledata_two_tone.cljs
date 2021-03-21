(ns reagent-material-ui.icons.r-mobiledata-two-tone
  "Imports @material-ui/icons/RMobiledataTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def r-mobiledata-two-tone (create-svg-icon (e "path" #js {"d" "M7.8 7.2L9 10H7L5.87 7.33H4V10H2V2h5c1.13 0 2 .87 2 2v1.33c0 .8-.53 1.54-1.2 1.87zM7 4H4v1.33h3V4z"})
                                            "RMobiledataTwoTone"))
