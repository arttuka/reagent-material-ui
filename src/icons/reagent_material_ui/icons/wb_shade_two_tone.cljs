(ns reagent-material-ui.icons.wb-shade-two-tone
  "Imports @material-ui/icons/WbShadeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def wb-shade-two-tone (create-svg-icon (e "path" #js {"d" "M14 12v2.5l5.5 5.5H22l-8-8zm0 8h3l-3-3v3zM8 4l-6 6h2v10h8V10h2L8 4zm1 10H7v-4h2v4z"})
                                        "WbShadeTwoTone"))
