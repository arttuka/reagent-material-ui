(ns reagent-material-ui.icons.web-asset-sharp
  "Imports @material-ui/icons/WebAssetSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def web-asset-sharp (create-svg-icon (e "path" #js {"d" "M3 4v16h18V4H3zm16 14H5V8h14v10z"})
                                      "WebAssetSharp"))
