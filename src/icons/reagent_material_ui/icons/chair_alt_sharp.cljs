(ns reagent-material-ui.icons.chair-alt-sharp
  "Imports @material-ui/icons/ChairAltSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def chair-alt-sharp (create-svg-icon (e "path" #js {"d" "M16 10h3V3H5v7h3v2H5v9h2v-3h10v3h2v-9h-3v-2zM7 8V5h10v3H7zm10 8H7v-2h10v2zm-3-4h-4v-2h4v2z"})
                                      "ChairAltSharp"))
