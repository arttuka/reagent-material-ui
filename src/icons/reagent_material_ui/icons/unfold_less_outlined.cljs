(ns reagent-material-ui.icons.unfold-less-outlined
  "Imports @material-ui/icons/UnfoldLessOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def unfold-less-outlined (create-svg-icon (e "path" #js {"d" "M7.41 18.59L8.83 20 12 16.83 15.17 20l1.41-1.41L12 14l-4.59 4.59zm9.18-13.18L15.17 4 12 7.17 8.83 4 7.41 5.41 12 10l4.59-4.59z"})
                                           "UnfoldLessOutlined"))
