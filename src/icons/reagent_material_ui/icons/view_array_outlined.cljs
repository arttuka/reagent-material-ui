(ns reagent-material-ui.icons.view-array-outlined
  "Imports @material-ui/icons/ViewArrayOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-array-outlined (create-svg-icon (e "path" #js {"d" "M15 7v9h-5V7h5m6-2h-3v13h3V5zm-4 0H8v13h9V5zM7 5H4v13h3V5z"})
                                          "ViewArrayOutlined"))
