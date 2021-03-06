(ns reagent-material-ui.icons.view-stream-sharp
  "Imports @material-ui/icons/ViewStreamSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-stream-sharp (create-svg-icon (e "path" #js {"d" "M4 18h17v-6H4v6zM4 5v6h17V5H4z"})
                                        "ViewStreamSharp"))
