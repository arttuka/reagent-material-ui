(ns reagent-material-ui.icons.details-outlined
  "Imports @material-ui/icons/DetailsOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def details-outlined (create-svg-icon (e "path" #js {"d" "M3 4l9 16 9-16H3zm3.38 2h11.25L12 16 6.38 6z"})
                                       "DetailsOutlined"))
