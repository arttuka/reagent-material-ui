(ns reagent-material-ui.icons.label-important-outlined
  "Imports @material-ui/icons/LabelImportantOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def label-important-outlined (create-svg-icon (e "path" #js {"d" "M4 18.99h11c.67 0 1.27-.32 1.63-.83L21 12l-4.37-6.16C16.27 5.33 15.67 5 15 5H4l5 7-5 6.99z"})
                                               "LabelImportantOutlined"))
