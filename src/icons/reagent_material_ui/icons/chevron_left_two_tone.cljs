(ns reagent-material-ui.icons.chevron-left-two-tone
  "Imports @material-ui/icons/ChevronLeftTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def chevron-left-two-tone (create-svg-icon (e "path" #js {"d" "M15.41 7.41L14 6l-6 6 6 6 1.41-1.41L10.83 12l4.58-4.59z"})
                                            "ChevronLeftTwoTone"))
