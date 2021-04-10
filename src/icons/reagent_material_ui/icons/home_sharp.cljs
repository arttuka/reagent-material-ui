(ns reagent-material-ui.icons.home-sharp
  "Imports @material-ui/icons/HomeSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def home-sharp (create-svg-icon (e "path" #js {"d" "M10 20v-6h4v6h5v-8h3L12 3 2 12h3v8h5z"})
                                 "HomeSharp"))
