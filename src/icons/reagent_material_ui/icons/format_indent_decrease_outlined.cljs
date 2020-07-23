(ns reagent-material-ui.icons.format-indent-decrease-outlined
  "Imports @material-ui/icons/FormatIndentDecreaseOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-indent-decrease-outlined (create-svg-icon (e "path" #js {"d" "M11 17h10v-2H11v2zm-8-5l4 4V8l-4 4zm0 9h18v-2H3v2zM3 3v2h18V3H3zm8 6h10V7H11v2zm0 4h10v-2H11v2z"})
                                                      "FormatIndentDecreaseOutlined"))
