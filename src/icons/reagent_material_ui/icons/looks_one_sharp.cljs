(ns reagent-material-ui.icons.looks-one-sharp
  "Imports @material-ui/icons/LooksOneSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def looks-one-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zm-7 14h-2V9h-2V7h4v10z"})
                                      "LooksOneSharp"))
