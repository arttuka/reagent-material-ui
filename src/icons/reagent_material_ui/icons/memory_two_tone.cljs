(ns reagent-material-ui.icons.memory-two-tone
  "Imports @material-ui/icons/MemoryTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def memory-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7 17h10V7H7v10zm2-8h6v6H9V9z", "opacity" ".3"}) (e "path" #js {"d" "M21 11V9h-2V7c0-1.1-.9-2-2-2h-2V3h-2v2h-2V3H9v2H7c-1.1 0-2 .9-2 2v2H3v2h2v2H3v2h2v2c0 1.1.9 2 2 2h2v2h2v-2h2v2h2v-2h2c1.1 0 2-.9 2-2v-2h2v-2h-2v-2h2zm-4 6H7V7h10v10zm-2-8H9v6h6V9zm-2 4h-2v-2h2v2z"}))
                                      "MemoryTwoTone"))
