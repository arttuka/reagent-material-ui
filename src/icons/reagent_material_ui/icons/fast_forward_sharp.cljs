(ns reagent-material-ui.icons.fast-forward-sharp
  "Imports @material-ui/icons/FastForwardSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def fast-forward-sharp (create-svg-icon (e "path" #js {"d" "M4 18l8.5-6L4 6v12zm9-12v12l8.5-6L13 6z"})
                                         "FastForwardSharp"))
