(ns reagent-material-ui.icons.dehaze-two-tone
  "Imports @material-ui/icons/DehazeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def dehaze-two-tone (create-svg-icon (e "path" #js {"d" "M2 16v2h20v-2H2zm0-5v2h20v-2H2zm0-5v2h20V6H2z"})
                                      "DehazeTwoTone"))
