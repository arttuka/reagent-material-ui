(ns reagent-material-ui.icons.first-page
  "Imports @material-ui/icons/FirstPage as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def first-page (create-svg-icon (e "path" #js {"d" "M18.41 16.59 13.82 12l4.59-4.59L17 6l-6 6 6 6zM6 6h2v12H6z"})
                                 "FirstPage"))
