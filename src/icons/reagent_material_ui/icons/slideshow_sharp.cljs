(ns reagent-material-ui.icons.slideshow-sharp
  "Imports @material-ui/icons/SlideshowSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def slideshow-sharp (create-svg-icon (e "path" #js {"d" "M10 8v8l5-4-5-4zm11-5H3v18h18V3zm-2 16H5V5h14v14z"})
                                      "SlideshowSharp"))
