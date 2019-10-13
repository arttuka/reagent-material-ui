(ns reagent-material-ui.icons.format-underlined-sharp
  "Imports @material-ui/icons/FormatUnderlinedSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-underlined-sharp (create-svg-icon (e "path" #js {"d" "M12 17c3.31 0 6-2.69 6-6V3h-2.5v8c0 1.93-1.57 3.5-3.5 3.5S8.5 12.93 8.5 11V3H6v8c0 3.31 2.69 6 6 6zm-7 2v2h14v-2H5z"})
                                              "FormatUnderlinedSharp"))
