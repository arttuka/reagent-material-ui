(ns reagent-material-ui.icons.graphic-eq-two-tone
  "Imports @material-ui/icons/GraphicEqTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def graphic-eq-two-tone (create-svg-icon (e "path" #js {"d" "M7 18h2V6H7v12zm4 4h2V2h-2v20zm-8-8h2v-4H3v4zm12 4h2V6h-2v12zm4-8v4h2v-4h-2z"})
                                          "GraphicEqTwoTone"))
