(ns reagent-material-ui.icons.crop-free-sharp
  "Imports @material-ui/icons/CropFreeSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def crop-free-sharp (create-svg-icon (e "path" #js {"d" "M3 3v6h2V5h4V3H3zm2 12H3v6h6v-2H5v-4zm14 4h-4v2h6v-6h-2v4zm2-16h-6v2h4v4h2V3z"})
                                      "CropFreeSharp"))
