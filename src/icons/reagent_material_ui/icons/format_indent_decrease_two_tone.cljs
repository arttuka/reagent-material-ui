(ns reagent-material-ui.icons.format-indent-decrease-two-tone
  "Imports @material-ui/icons/FormatIndentDecreaseTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def format-indent-decrease-two-tone (create-svg-icon (e "path" #js {"d" "M7 16V8l-4 4zm4-9h10v2H11zm0 4h10v2H11zm0 4h10v2H11zm-8 4h18v2H3zM3 3h18v2H3z"})
                                                      "FormatIndentDecreaseTwoTone"))
