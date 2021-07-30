(ns reagent-material-ui.icons.fast-forward
  "Imports @material-ui/icons/FastForward as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def fast-forward (create-svg-icon (e "path" #js {"d" "m4 18 8.5-6L4 6v12zm9-12v12l8.5-6L13 6z"})
                                   "FastForward"))
