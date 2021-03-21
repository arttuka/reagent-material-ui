(ns reagent-material-ui.icons.vertical-align-top-sharp
  "Imports @material-ui/icons/VerticalAlignTopSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def vertical-align-top-sharp (create-svg-icon (e "path" #js {"d" "M8 11h3v10h2V11h3l-4-4-4 4zM4 3v2h16V3H4z"})
                                               "VerticalAlignTopSharp"))
