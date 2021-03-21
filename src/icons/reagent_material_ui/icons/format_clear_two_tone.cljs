(ns reagent-material-ui.icons.format-clear-two-tone
  "Imports @material-ui/icons/FormatClearTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def format-clear-two-tone (create-svg-icon (e "path" #js {"d" "M20 8V5H6.39l3 3h1.83l-.55 1.28 2.09 2.1L14.21 8zM3.41 4.86L2 6.27l6.97 6.97L6.5 19h3l1.57-3.66L16.73 21l1.41-1.41z"})
                                            "FormatClearTwoTone"))
