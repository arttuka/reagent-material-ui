(ns reagent-material-ui.icons.description-two-tone
  "Imports @material-ui/icons/DescriptionTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def description-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M13 4H6v16h12V9h-5V4zm3 14H8v-2h8v2zm0-6v2H8v-2h8z", "opacity" ".3"}) (e "path" #js {"d" "M8 16h8v2H8zm0-4h8v2H8zm6-10H6c-1.1 0-2 .9-2 2v16c0 1.1.89 2 1.99 2H18c1.1 0 2-.9 2-2V8l-6-6zm4 18H6V4h7v5h5v11z"}))
                                           "DescriptionTwoTone"))
