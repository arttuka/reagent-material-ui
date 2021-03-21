(ns reagent-material-ui.icons.four-g-plus-mobiledata-sharp
  "Imports @material-ui/icons/FourGPlusMobiledataSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def four-g-plus-mobiledata-sharp (create-svg-icon (e "path" #js {"d" "M13 11v2h2v2h-4V9h6V7H9v10h8v-6h-4zm11 0h-2V9h-2v2h-2v2h2v2h2v-2h2v-2zM7 7H5v5H3V7H1v7h4v3h2v-3h1v-2H7V7z"})
                                                   "FourGPlusMobiledataSharp"))
