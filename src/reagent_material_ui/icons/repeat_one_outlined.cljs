(ns reagent-material-ui.icons.repeat-one-outlined
  "Imports @material-ui/icons/RepeatOneOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def repeat-one-outlined (create-svg-icon (e "path" #js {"d" "M7 7h10v3l4-4-4-4v3H5v6h2V7zm10 10H7v-3l-4 4 4 4v-3h12v-6h-2v4zm-4-2V9h-1l-2 1v1h1.5v4H13z"})
                                          "RepeatOneOutlined"))
