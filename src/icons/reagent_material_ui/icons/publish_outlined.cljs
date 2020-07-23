(ns reagent-material-ui.icons.publish-outlined
  "Imports @material-ui/icons/PublishOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def publish-outlined (create-svg-icon (e "path" #js {"d" "M5 4h14v2H5zm0 10h4v6h6v-6h4l-7-7-7 7zm8-2v6h-2v-6H9.83L12 9.83 14.17 12H13z"})
                                       "PublishOutlined"))
