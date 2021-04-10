(ns reagent-material-ui.icons.format-list-numbered-rtl-two-tone
  "Imports @material-ui/icons/FormatListNumberedRtlTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def format-list-numbered-rtl-two-tone (create-svg-icon (e "path" #js {"d" "M2 11h14v2H2zm16 6h2v.5h-1v1h1v.5h-2v1h3v-4h-3zm0-6h1.8L18 13.1v.9h3v-1h-1.8l1.8-2.1V10h-3zm2-3V4h-2v1h1v3zM2 17h14v2H2zM2 5h14v2H2z"})
                                                        "FormatListNumberedRtlTwoTone"))
