(ns reagent-material-ui.icons.present-to-all-rounded
  "Imports @material-ui/icons/PresentToAllRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def present-to-all-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M20 4H4c-1.11 0-2 .89-2 2v12c0 1.11.89 2 2 2h16c1.11 0 2-.89 2-2V6c0-1.11-.89-2-2-2zm0 14.02H4V5.98h16v12.04z"}) (e "path" #js {"d" "M11 12H9.21c-.45 0-.67-.54-.35-.85l2.79-2.79c.2-.2.51-.2.71 0l2.79 2.79c.31.31.09.85-.35.85H13v3c0 .55-.45 1-1 1s-1-.45-1-1v-3z"}))
                                             "PresentToAllRounded"))
