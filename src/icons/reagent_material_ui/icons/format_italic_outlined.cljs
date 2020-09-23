(ns reagent-material-ui.icons.format-italic-outlined
  "Imports @material-ui/icons/FormatItalicOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-italic-outlined (create-svg-icon (e "path" #js {"d" "M10 4v3h2.21l-3.42 8H6v3h8v-3h-2.21l3.42-8H18V4h-8z"})
                                             "FormatItalicOutlined"))
