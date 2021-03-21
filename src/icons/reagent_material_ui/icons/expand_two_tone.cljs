(ns reagent-material-ui.icons.expand-two-tone
  "Imports @material-ui/icons/ExpandTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def expand-two-tone (create-svg-icon (e "path" #js {"d" "M4 20h16v2H4v-2zM4 2h16v2H4V2zm9 7h3l-4-4-4 4h3v6H8l4 4 4-4h-3V9z"})
                                      "ExpandTwoTone"))
