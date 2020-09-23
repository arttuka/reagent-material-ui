(ns reagent-material-ui.icons.flash-on-outlined
  "Imports @material-ui/icons/FlashOnOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def flash-on-outlined (create-svg-icon (e "path" #js {"d" "M7 2v11h3v9l7-12h-4l3-8z"})
                                        "FlashOnOutlined"))
