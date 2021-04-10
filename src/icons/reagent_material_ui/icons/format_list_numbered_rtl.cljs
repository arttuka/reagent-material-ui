(ns reagent-material-ui.icons.format-list-numbered-rtl
  "Imports @material-ui/icons/FormatListNumberedRtl as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def format-list-numbered-rtl (create-svg-icon (e "path" #js {"d" "M18 17h2v.5h-1v1h1v.5h-2v1h3v-4h-3zm1-9h1V4h-2v1h1zm-1 3h1.8L18 13.1v.9h3v-1h-1.8l1.8-2.1V10h-3zM2 5h14v2H2zm0 12h14v2H2zm0-6h14v2H2z"})
                                               "FormatListNumberedRtl"))
