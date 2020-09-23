(ns reagent-material-ui.icons.menu-open-two-tone
  "Imports @material-ui/icons/MenuOpenTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def menu-open-two-tone (create-svg-icon (e "path" #js {"d" "M3 18h13v-2H3v2zm0-5h10v-2H3v2zm0-7v2h13V6H3zm18 9.59L17.42 12 21 8.41 19.59 7l-5 5 5 5L21 15.59z"})
                                         "MenuOpenTwoTone"))
