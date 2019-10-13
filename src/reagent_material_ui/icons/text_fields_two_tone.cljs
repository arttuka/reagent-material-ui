(ns reagent-material-ui.icons.text-fields-two-tone
  "Imports @material-ui/icons/TextFieldsTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def text-fields-two-tone (create-svg-icon (e "path" #js {"d" "M12.5 12h3v7h3v-7h3V9h-9zm3-8h-13v3h5v12h3V7h5z"})
                                           "TextFieldsTwoTone"))
