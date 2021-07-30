(ns reagent-material-ui.icons.fast-rewind-sharp
  "Imports @material-ui/icons/FastRewindSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def fast-rewind-sharp (create-svg-icon (e "path" #js {"d" "M11 18V6l-8.5 6 8.5 6zm.5-6 8.5 6V6l-8.5 6z"})
                                        "FastRewindSharp"))
