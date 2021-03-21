(ns reagent-material-ui.icons.crop-original-sharp
  "Imports @material-ui/icons/CropOriginalSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def crop-original-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-2 16H5V5h14v14zm-5.04-6.71l-2.75 3.54-1.96-2.36L6.5 17h11l-3.54-4.71z"})
                                          "CropOriginalSharp"))
