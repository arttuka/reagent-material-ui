(ns reagent-material-ui.icons.developer-mode-sharp
  "Imports @material-ui/icons/DeveloperModeSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def developer-mode-sharp (create-svg-icon (e "path" #js {"d" "M7 5h10v2h2V1.01L5 1v6h2V5zm8.41 11.59L20 12l-4.59-4.59L14 8.83 17.17 12 14 15.17l1.41 1.42zM10 15.17L6.83 12 10 8.83 8.59 7.41 4 12l4.59 4.59L10 15.17zM17 19H7v-2H5v6h14v-6h-2v2z"})
                                           "DeveloperModeSharp"))
