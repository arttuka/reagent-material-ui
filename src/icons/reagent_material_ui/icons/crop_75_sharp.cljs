(ns reagent-material-ui.icons.crop-75-sharp
  "Imports @material-ui/icons/Crop75Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def crop-75-sharp (create-svg-icon (e "path" #js {"d" "M21 7H3v10h18V7zm-2 8H5V9h14v6z"})
                                    "Crop75Sharp"))
