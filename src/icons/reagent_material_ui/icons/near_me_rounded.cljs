(ns reagent-material-ui.icons.near-me-rounded
  "Imports @material-ui/icons/NearMeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def near-me-rounded (create-svg-icon (e "path" #js {"d" "M18.95 3.76L3.67 9.44c-.4.15-.67.53-.67.96 0 .42.26.8.65.96l6.42 2.57 2.57 6.42c.16.39.54.65.96.65.43 0 .82-.27.97-.67l5.68-15.28c.29-.81-.49-1.59-1.3-1.29z"})
                                      "NearMeRounded"))
