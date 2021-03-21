(ns reagent-material-ui.icons.grid-view-sharp
  "Imports @material-ui/icons/GridViewSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def grid-view-sharp (create-svg-icon (e "path" #js {"d" "M3 3h8v8H3zm0 10h8v8H3zM13 3h8v8h-8zm0 10h8v8h-8z"})
                                      "GridViewSharp"))
