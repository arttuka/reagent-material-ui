(ns reagent-material-ui.icons.skip-next-sharp
  "Imports @material-ui/icons/SkipNextSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def skip-next-sharp (create-svg-icon (e "path" #js {"d" "M6 18l8.5-6L6 6v12zM16 6v12h2V6h-2z"})
                                      "SkipNextSharp"))
