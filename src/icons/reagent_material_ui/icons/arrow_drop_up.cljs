(ns reagent-material-ui.icons.arrow-drop-up
  "Imports @material-ui/icons/ArrowDropUp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def arrow-drop-up (create-svg-icon (e "path" #js {"d" "M7 14l5-5 5 5z"})
                                    "ArrowDropUp"))
