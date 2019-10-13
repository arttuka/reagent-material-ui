(ns reagent-material-ui.icons.border-outer-two-tone
  "Imports @material-ui/icons/BorderOuterTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def border-outer-two-tone (create-svg-icon (e "path" #js {"d" "M11 11h2v2h-2zm0-4h2v2h-2zm10-4H3v18h18V3zm-2 16H5V5h14v14zm-4-8h2v2h-2zm-8 0h2v2H7zm4 4h2v2h-2z"})
                                            "BorderOuterTwoTone"))
