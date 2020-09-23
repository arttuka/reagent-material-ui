(ns reagent-material-ui.icons.tour-outlined
  "Imports @material-ui/icons/TourOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def tour-outlined (create-svg-icon (e "path" #js {"d" "M21 4H7V2H5v20h2v-8h14l-2-5 2-5zm-3.86 5.74l.9 2.26H7V6h11.05l-.9 2.26-.3.74.29.74zM14 9c0 1.1-.9 2-2 2s-2-.9-2-2 .9-2 2-2 2 .9 2 2z"})
                                    "TourOutlined"))
