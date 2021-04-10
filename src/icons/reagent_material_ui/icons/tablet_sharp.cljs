(ns reagent-material-ui.icons.tablet-sharp
  "Imports @material-ui/icons/TabletSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def tablet-sharp (create-svg-icon (e "path" #js {"d" "M23 4H1v16h21.99L23 4zm-4 14H5V6h14v12z"})
                                   "TabletSharp"))
