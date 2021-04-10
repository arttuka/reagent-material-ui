(ns reagent-material-ui.icons.navigate-next-two-tone
  "Imports @material-ui/icons/NavigateNextTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def navigate-next-two-tone (create-svg-icon (e "path" #js {"d" "M10.02 18l6-6-6-6-1.41 1.41L13.19 12l-4.58 4.59z"})
                                             "NavigateNextTwoTone"))
