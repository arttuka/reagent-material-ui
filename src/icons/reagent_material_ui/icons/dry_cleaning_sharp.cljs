(ns reagent-material-ui.icons.dry-cleaning-sharp
  "Imports @material-ui/icons/DryCleaningSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def dry-cleaning-sharp (create-svg-icon (e "path" #js {"d" "m21 12-8-3.56V6h-1c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1h2c0-1.84-1.66-3.3-3.56-2.95-1.18.22-2.15 1.17-2.38 2.35-.3 1.56.6 2.94 1.94 3.42v.63l-8 3.56V16h4v6h10v-6h4v-4zm-2 2h-2v-1H7v1H5v-.7l7-3.11 7 3.11v.7z"})
                                         "DryCleaningSharp"))
