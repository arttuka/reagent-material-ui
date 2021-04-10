(ns reagent-material-ui.icons.colorize-sharp
  "Imports @material-ui/icons/ColorizeSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def colorize-sharp (create-svg-icon (e "path" #js {"d" "M21.42 6.34l-3.75-3.75-3.82 3.82-1.94-1.91-1.41 1.41 1.42 1.42L3 16.25V21h4.75l8.92-8.92 1.42 1.42 1.41-1.41-1.92-1.92 3.84-3.83zM6.92 19L5 17.08l8.06-8.06 1.92 1.92L6.92 19z"})
                                     "ColorizeSharp"))
