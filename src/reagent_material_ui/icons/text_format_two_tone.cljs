(ns reagent-material-ui.icons.text-format-two-tone
  "Imports @material-ui/icons/TextFormatTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def text-format-two-tone (create-svg-icon (e "path" #js {"d" "M5 17v2h14v-2H5zm4.5-4.2h5l.9 2.2h2.1L12.75 4h-1.5L6.5 15h2.1l.9-2.2zM12 5.98L13.87 11h-3.74L12 5.98z"})
                                           "TextFormatTwoTone"))
