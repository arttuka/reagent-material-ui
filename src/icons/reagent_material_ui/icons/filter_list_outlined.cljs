(ns reagent-material-ui.icons.filter-list-outlined
  "Imports @material-ui/icons/FilterListOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def filter-list-outlined (create-svg-icon (e "path" #js {"d" "M10 18h4v-2h-4v2zM3 6v2h18V6H3zm3 7h12v-2H6v2z"})
                                           "FilterListOutlined"))
