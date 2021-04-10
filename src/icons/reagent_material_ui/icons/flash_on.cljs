(ns reagent-material-ui.icons.flash-on
  "Imports @material-ui/icons/FlashOn as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def flash-on (create-svg-icon (e "path" #js {"d" "M7 2v11h3v9l7-12h-4l4-8z"})
                               "FlashOn"))
