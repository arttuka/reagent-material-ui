(ns reagent-material-ui.icons.image-not-supported-sharp
  "Imports @material-ui/icons/ImageNotSupportedSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def image-not-supported-sharp (create-svg-icon (e "path" #js {"d" "M21.9 21.9l-8.49-8.49L3 3l-.9-.9L.69 3.51 3 5.83V21h15.17l2.31 2.31 1.42-1.41zM5 18l3.5-4.5 2.5 3.01L12.17 15l3 3H5zm16 .17L5.83 3H21v15.17z"})
                                                "ImageNotSupportedSharp"))
