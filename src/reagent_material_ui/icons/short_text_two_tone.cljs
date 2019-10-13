(ns reagent-material-ui.icons.short-text-two-tone
  "Imports @material-ui/icons/ShortTextTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def short-text-two-tone (create-svg-icon (e "path" #js {"d" "M4 9h16v2H4zm0 4h10v2H4z"})
                                          "ShortTextTwoTone"))
