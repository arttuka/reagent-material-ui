(ns reagent-material-ui.icons.panorama-vertical-select-sharp
  "Imports @material-ui/icons/PanoramaVerticalSelectSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def panorama-vertical-select-sharp (create-svg-icon (e "path" #js {"d" "M18.49 11.99c0-5.25 1.54-9.01 1.92-10H3.59c.76 2.16 1.9 5.21 1.9 10 0 4.78-1.17 7.91-1.9 10H20.4c-.74-2.08-1.91-5.23-1.91-10z"})
                                                     "PanoramaVerticalSelectSharp"))
