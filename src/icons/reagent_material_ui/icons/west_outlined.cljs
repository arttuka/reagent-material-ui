(ns reagent-material-ui.icons.west-outlined
  "Imports @material-ui/icons/WestOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def west-outlined (create-svg-icon (e "path" #js {"d" "m9 19 1.41-1.41L5.83 13H22v-2H5.83l4.59-4.59L9 5l-7 7 7 7z"})
                                    "WestOutlined"))
