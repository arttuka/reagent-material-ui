(ns reagent-material-ui.icons.crop-169-sharp
  "Imports @material-ui/icons/Crop169Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def crop-169-sharp (create-svg-icon (e "path" #js {"d" "M21 6H3v12h18V6zm-2 10H5V8h14v8z"})
                                     "Crop169Sharp"))
