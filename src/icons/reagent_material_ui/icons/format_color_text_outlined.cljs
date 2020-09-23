(ns reagent-material-ui.icons.format-color-text-outlined
  "Imports @material-ui/icons/FormatColorTextOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def format-color-text-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M0 20h24v4H0v-4z", "fillOpacity" ".36"}) (e "path" #js {"d" "M11 3L5.5 17h2.25l1.12-3h6.25l1.12 3h2.25L13 3h-2zm-1.38 9L12 5.67 14.38 12H9.62z"}))
                                                 "FormatColorTextOutlined"))
