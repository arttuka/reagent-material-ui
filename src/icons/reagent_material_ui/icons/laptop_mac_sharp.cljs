(ns reagent-material-ui.icons.laptop-mac-sharp
  "Imports @material-ui/icons/LaptopMacSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def laptop-mac-sharp (create-svg-icon (e "path" #js {"d" "M20 18l1.99-2L22 3H2v13l2 2H0v2h24v-2h-4zM4 5h16v11H4V5zm8 14c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z"})
                                       "LaptopMacSharp"))
