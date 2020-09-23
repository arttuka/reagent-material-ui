(ns reagent-material-ui.icons.navigate-before-outlined
  "Imports @material-ui/icons/NavigateBeforeOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def navigate-before-outlined (create-svg-icon (e "path" #js {"d" "M15.61 7.41L14.2 6l-6 6 6 6 1.41-1.41L11.03 12l4.58-4.59z"})
                                               "NavigateBeforeOutlined"))
