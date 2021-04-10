(ns reagent-material-ui.icons.crop-54-sharp
  "Imports @material-ui/icons/Crop54Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def crop-54-sharp (create-svg-icon (e "path" #js {"d" "M21 5H3v14h18V5zm-2 12H5V7h14v10z"})
                                    "Crop54Sharp"))
