(ns reagent-material-ui.icons.flash-on-two-tone
  "Imports @material-ui/icons/FlashOnTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def flash-on-two-tone (create-svg-icon (e "path" #js {"d" "M17 10h-4l3-8H7v11h3v9z"})
                                        "FlashOnTwoTone"))
