(ns reagent-material-ui.icons.crop-32-sharp
  "Imports @material-ui/icons/Crop32Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def crop-32-sharp (create-svg-icon (e "path" #js {"d" "M21 4H3v16h18V4zm-2 14H5V6h14v12z"})
                                    "Crop32Sharp"))
