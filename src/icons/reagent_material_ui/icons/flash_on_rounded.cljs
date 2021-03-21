(ns reagent-material-ui.icons.flash-on-rounded
  "Imports @material-ui/icons/FlashOnRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def flash-on-rounded (create-svg-icon (e "path" #js {"d" "M7 3v10c0 .55.45 1 1 1h2v7.15c0 .51.67.69.93.25l5.19-8.9c.39-.67-.09-1.5-.86-1.5H13l3.38-7.59c.29-.67-.2-1.41-.92-1.41H8c-.55 0-1 .45-1 1z"})
                                       "FlashOnRounded"))
