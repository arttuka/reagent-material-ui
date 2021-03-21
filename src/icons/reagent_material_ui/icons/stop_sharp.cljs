(ns reagent-material-ui.icons.stop-sharp
  "Imports @material-ui/icons/StopSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def stop-sharp (create-svg-icon (e "path" #js {"d" "M6 6h12v12H6V6z"})
                                 "StopSharp"))
