(ns reagent-material-ui.icons.gif-sharp
  "Imports @material-ui/icons/GifSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def gif-sharp (create-svg-icon (e "path" #js {"d" "M11.5 9H13v6h-1.5V9zM10 9H5v6h5v-3H8.5v1.5h-2v-3H10V9zm9 1.5V9h-4.5v6H16v-2h2v-1.5h-2v-1h3z"})
                                "GifSharp"))
