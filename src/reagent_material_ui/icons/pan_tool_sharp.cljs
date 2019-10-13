(ns reagent-material-ui.icons.pan-tool-sharp
  "Imports @material-ui/icons/PanToolSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def pan-tool-sharp (create-svg-icon (e "path" #js {"d" "M23 4v20H10.02L1 14.83 2.9 13 8 15.91V3h3v8h1V0h3v11h1V1h3v10h1V4h3z"})
                                     "PanToolSharp"))
