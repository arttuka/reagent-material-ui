(ns reagent-material-ui.icons.image-not-supported-sharp
  "Imports @material-ui/icons/ImageNotSupportedSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def image-not-supported-sharp (create-svg-icon (e "path" #js {"d" "m21.9 21.9-8.49-8.49L3 3l-.9-.9L.69 3.51 3 5.83V21h15.17l2.31 2.31 1.42-1.41zM5 18l3.5-4.5 2.5 3.01L12.17 15l3 3H5zm16 .17L5.83 3H21v15.17z"})
                                                "ImageNotSupportedSharp"))
