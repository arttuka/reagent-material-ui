(ns reagent-material-ui.icons.auto-awesome-mosaic-sharp
  "Imports @material-ui/icons/AutoAwesomeMosaicSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def auto-awesome-mosaic-sharp (create-svg-icon (e "path" #js {"d" "M3 21h8V3H3v18zM21 3h-8v8h8V3zm-8 18h8v-8h-8v8z"})
                                                "AutoAwesomeMosaicSharp"))
