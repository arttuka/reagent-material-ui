(ns reagent-material-ui.icons.work-off-two-tone
  "Imports @material-ui/icons/WorkOffTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def work-off-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 8v11h13.74l-11-11zm8.4 0l7.6 7.6V8z", "opacity" ".3"}) (e "path" #js {"d" "M10 4h4v2h-3.6l2 2H20v7.6l2 2V8c0-1.11-.89-2-2-2h-4V4c0-1.11-.89-2-2-2h-4c-.99 0-1.8.7-1.96 1.64L10 5.6V4zM3.4 1.84L1.99 3.25 4.74 6H4c-1.11 0-1.99.89-1.99 2L2 19c0 1.11.89 2 2 2h15.74l2 2 1.41-1.41L3.4 1.84zM4 19V8h2.74l11 11H4z"}))
                                        "WorkOffTwoTone"))
