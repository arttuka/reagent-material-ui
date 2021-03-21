(ns reagent-material-ui.icons.arrow-right-rounded
  "Imports @material-ui/icons/ArrowRightRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-right-rounded (create-svg-icon (e "path" #js {"d" "M11.71 15.29l2.59-2.59c.39-.39.39-1.02 0-1.41L11.71 8.7c-.63-.62-1.71-.18-1.71.71v5.17c0 .9 1.08 1.34 1.71.71z"})
                                          "ArrowRightRounded"))
