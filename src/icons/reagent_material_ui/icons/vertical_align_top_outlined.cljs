(ns reagent-material-ui.icons.vertical-align-top-outlined
  "Imports @material-ui/icons/VerticalAlignTopOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def vertical-align-top-outlined (create-svg-icon (e "path" #js {"d" "M8 11h3v10h2V11h3l-4-4-4 4zM4 3v2h16V3H4z"})
                                                  "VerticalAlignTopOutlined"))
