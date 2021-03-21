(ns reagent-material-ui.icons.tablet-rounded
  "Imports @material-ui/icons/TabletRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def tablet-rounded (create-svg-icon (e "path" #js {"d" "M1.01 6L1 18c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2H3c-1.1 0-1.99.9-1.99 2zM18 6v12H6V6h12z"})
                                     "TabletRounded"))
