(ns reagent-material-ui.icons.add-outlined
  "Imports @material-ui/icons/AddOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def add-outlined (create-svg-icon (e "path" #js {"d" "M19 13h-6v6h-2v-6H5v-2h6V5h2v6h6v2z"})
                                   "AddOutlined"))
