(ns reagent-material-ui.icons.mobiledata-off-two-tone
  "Imports @material-ui/icons/MobiledataOffTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def mobiledata-off-two-tone (create-svg-icon (e "path" #js {"d" "M16 7h3l-4-4-4 4h3v4.17l2 2zM2.81 2.81 1.39 4.22 8 10.83v6.18l-3 .01L9 21l4-4-3 .01v-4.18l9.78 9.78 1.41-1.42z"})
                                              "MobiledataOffTwoTone"))
