(ns reagent-material-ui.icons.west-two-tone
  "Imports @material-ui/icons/WestTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def west-two-tone (create-svg-icon (e "path" #js {"d" "M9 19l1.41-1.41L5.83 13H22v-2H5.83l4.59-4.59L9 5l-7 7 7 7z"})
                                    "WestTwoTone"))
