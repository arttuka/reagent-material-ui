(ns reagent-material-ui.icons.exposure-plus-1-sharp
  "Imports @material-ui/icons/ExposurePlus1Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def exposure-plus-1-sharp (create-svg-icon (e "path" #js {"d" "M10 7H8v4H4v2h4v4h2v-4h4v-2h-4V7zm10 11h-2V7.38L15 8.4V6.7L19.7 5h.3v13z"})
                                            "ExposurePlus1Sharp"))
