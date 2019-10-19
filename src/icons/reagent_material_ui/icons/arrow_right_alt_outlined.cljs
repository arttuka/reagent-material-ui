(ns reagent-material-ui.icons.arrow-right-alt-outlined
  "Imports @material-ui/icons/ArrowRightAltOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def arrow-right-alt-outlined (create-svg-icon (e "path" #js {"d" "M16.01 11H4v2h12.01v3L20 12l-3.99-4v3z"})
                                               "ArrowRightAltOutlined"))
