(ns reagent-material-ui.icons.flash-on-sharp
  "Imports @material-ui/icons/FlashOnSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def flash-on-sharp (create-svg-icon (e "path" #js {"d" "M7 2v11h3v9l7-12h-4l3-8z"})
                                     "FlashOnSharp"))
