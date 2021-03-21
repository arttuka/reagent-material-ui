(ns reagent-material-ui.icons.smart-display-sharp
  "Imports @material-ui/icons/SmartDisplaySharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def smart-display-sharp (create-svg-icon (e "path" #js {"d" "M22 4H2v16h20V4zM9.5 16.5v-9l7 4.5-7 4.5z"})
                                          "SmartDisplaySharp"))
