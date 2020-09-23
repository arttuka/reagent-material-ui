(ns reagent-material-ui.icons.text-fields-outlined
  "Imports @material-ui/icons/TextFieldsOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def text-fields-outlined (create-svg-icon (e "path" #js {"d" "M2.5 4v3h5v12h3V7h5V4h-13zm19 5h-9v3h3v7h3v-7h3V9z"})
                                           "TextFieldsOutlined"))
