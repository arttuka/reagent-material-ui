(ns reagent-material-ui.icons.format-size
  "Imports @material-ui/icons/FormatSize as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def format-size (create-svg-icon (e "path" #js {"d" "M9 4v3h5v12h3V7h5V4H9zm-6 8h3v7h3v-7h3V9H3v3z"})
                                  "FormatSize"))
