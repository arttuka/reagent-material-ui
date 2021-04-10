(ns reagent-material-ui.icons.equalizer
  "Imports @material-ui/icons/Equalizer as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def equalizer (create-svg-icon (e "path" #js {"d" "M10 20h4V4h-4v16zm-6 0h4v-8H4v8zM16 9v11h4V9h-4z"})
                                "Equalizer"))
