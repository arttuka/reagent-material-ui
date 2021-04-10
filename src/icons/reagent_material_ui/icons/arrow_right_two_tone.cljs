(ns reagent-material-ui.icons.arrow-right-two-tone
  "Imports @material-ui/icons/ArrowRightTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-right-two-tone (create-svg-icon (e "path" #js {"d" "M10 17l5-5-5-5v10z"})
                                           "ArrowRightTwoTone"))
