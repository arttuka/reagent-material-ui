(ns reagent-material-ui.icons.four-g-mobiledata-two-tone
  "Imports @material-ui/icons/FourGMobiledataTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def four-g-mobiledata-two-tone (create-svg-icon (e "path" #js {"d" "M9 7H7v5H5V7H3v7h4v3h2v-3h2v-2H9V7zm8 4v2h2v2h-5V9h7c0-1.1-.9-2-2-2h-5c-1.1 0-2 .9-2 2v6c0 1.1.9 2 2 2h5c1.1 0 2-.9 2-2v-4h-4z"})
                                                 "FourGMobiledataTwoTone"))
