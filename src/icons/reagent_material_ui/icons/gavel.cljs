(ns reagent-material-ui.icons.gavel
  "Imports @material-ui/icons/Gavel as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def gavel (create-svg-icon (e "path" #js {"d" "M5.2496 8.0688l2.83-2.8268 14.134 14.15-2.83 2.8268zM9.4857 3.8272l2.828-2.8288 5.6576 5.656-2.828 2.8288zM.9989 12.3147l2.8284-2.8284L9.484 15.143l-2.8284 2.8284zM1 21h12v2H1z"})
                            "Gavel"))
