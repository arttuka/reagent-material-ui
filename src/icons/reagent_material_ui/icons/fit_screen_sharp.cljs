(ns reagent-material-ui.icons.fit-screen-sharp
  "Imports @material-ui/icons/FitScreenSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def fit-screen-sharp (create-svg-icon (e "path" #js {"d" "M17 4h5v5h-2V6h-3V4zM4 9V6h3V4H2v5h2zm16 6v3h-3v2h5v-5h-2zM7 18H4v-3H2v5h5v-2zM18 8H6v8h12V8z"})
                                       "FitScreenSharp"))
