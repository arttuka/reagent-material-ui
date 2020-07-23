(ns reagent-material-ui.icons.publish
  "Imports @material-ui/icons/Publish as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def publish (create-svg-icon (e "path" #js {"d" "M5 4v2h14V4H5zm0 10h4v6h6v-6h4l-7-7-7 7z"})
                              "Publish"))
