(ns reagent-material-ui.icons.expand-less
  "Imports @material-ui/icons/ExpandLess as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def expand-less (create-svg-icon (e "path" #js {"d" "M12 8l-6 6 1.41 1.41L12 10.83l4.59 4.58L18 14z"})
                                  "ExpandLess"))
