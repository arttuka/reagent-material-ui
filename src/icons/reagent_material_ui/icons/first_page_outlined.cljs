(ns reagent-material-ui.icons.first-page-outlined
  "Imports @material-ui/icons/FirstPageOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def first-page-outlined (create-svg-icon (e "path" #js {"d" "M18.41 16.59 13.82 12l4.59-4.59L17 6l-6 6 6 6 1.41-1.41zM6 6h2v12H6V6z"})
                                          "FirstPageOutlined"))
