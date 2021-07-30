(ns reagent-material-ui.icons.text-rotate-up
  "Imports @material-ui/icons/TextRotateUp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def text-rotate-up (create-svg-icon (e "path" #js {"d" "M3 12v1.5l11 4.75v-2.1l-2.2-.9v-5l2.2-.9v-2.1L3 12zm7 2.62-5.02-1.87L10 10.88v3.74zm8-10.37-3 3h2v12.5h2V7.25h2l-3-3z"})
                                     "TextRotateUp"))
