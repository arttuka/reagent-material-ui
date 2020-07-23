(ns reagent-material-ui.icons.accessibility-two-tone
  "Imports @material-ui/icons/AccessibilityTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def accessibility-two-tone (create-svg-icon (e "path" #js {"d" "M12 2c1.1 0 2 .9 2 2s-.9 2-2 2-2-.9-2-2 .9-2 2-2zm9 7h-6v13h-2v-6h-2v6H9V9H3V7h18v2z"})
                                             "AccessibilityTwoTone"))
