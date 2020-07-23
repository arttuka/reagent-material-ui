(ns reagent-material-ui.icons.repeat-outlined
  "Imports @material-ui/icons/RepeatOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def repeat-outlined (create-svg-icon (e "path" #js {"d" "M7 7h10v3l4-4-4-4v3H5v6h2V7zm10 10H7v-3l-4 4 4 4v-3h12v-6h-2v4z"})
                                      "RepeatOutlined"))
