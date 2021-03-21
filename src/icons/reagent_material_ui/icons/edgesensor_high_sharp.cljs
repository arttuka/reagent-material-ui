(ns reagent-material-ui.icons.edgesensor-high-sharp
  "Imports @material-ui/icons/EdgesensorHighSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def edgesensor-high-sharp (create-svg-icon (e "path" #js {"d" "M3 7h2v7H3V7zm-3 3h2v7H0v-7zm22-3h2v7h-2V7zm-3 3h2v7h-2v-7zm-1-8H6v20h12V2zm-2 15H8V7h8v10z"})
                                            "EdgesensorHighSharp"))
