(ns reagent-material-ui.icons.double-arrow-two-tone
  "Imports @material-ui/icons/DoubleArrowTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def double-arrow-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15.5 5H11l5 7-5 7h4.5l5-7z"}) (e "path" #js {"d" "M8.5 5H4l5 7-5 7h4.5l5-7z"}))
                                            "DoubleArrowTwoTone"))
