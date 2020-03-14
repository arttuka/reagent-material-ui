(ns reagent-material-ui.icons.star-outlined
  "Imports @material-ui/icons/StarOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def star-outlined (create-svg-icon (e "path" #js {"d" "M12 17.27L18.18 21l-1.64-7.03L22 9.24l-7.19-.61L12 2 9.19 8.63 2 9.24l5.46 4.73L5.82 21 12 17.27z"})
                                    "StarOutlined"))
