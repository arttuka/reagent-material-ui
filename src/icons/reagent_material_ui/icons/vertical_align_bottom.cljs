(ns reagent-material-ui.icons.vertical-align-bottom
  "Imports @material-ui/icons/VerticalAlignBottom as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def vertical-align-bottom (create-svg-icon (e "path" #js {"d" "M16 13h-3V3h-2v10H8l4 4 4-4zM4 19v2h16v-2H4z"})
                                            "VerticalAlignBottom"))
