(ns reagent-material-ui.icons.align-horizontal-center-sharp
  "Imports @material-ui/icons/AlignHorizontalCenterSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def align-horizontal-center-sharp (create-svg-icon (e "path" #js {"d" "M11 2h2v5h8v3h-8v4h5v3h-5v5h-2v-5H6v-3h5v-4H3V7h8z"})
                                                    "AlignHorizontalCenterSharp"))
