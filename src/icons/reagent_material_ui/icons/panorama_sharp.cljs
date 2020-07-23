(ns reagent-material-ui.icons.panorama-sharp
  "Imports @material-ui/icons/PanoramaSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def panorama-sharp (create-svg-icon (e "path" #js {"d" "M23 20V4H1v16h22zM8.5 12.5l2.5 3.01L14.5 11l4.5 6H5l3.5-4.5z"})
                                     "PanoramaSharp"))
