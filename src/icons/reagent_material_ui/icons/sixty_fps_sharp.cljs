(ns reagent-material-ui.icons.sixty-fps-sharp
  "Imports @material-ui/icons/SixtyFpsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def sixty-fps-sharp (create-svg-icon (e "path" #js {"d" "M19 8v8h-4V8h4m3-3H12v14h10V5zM10 8V5H2v14h9v-9H5V8h5zm-2 5v3H5v-3h3z"})
                                      "SixtyFpsSharp"))
