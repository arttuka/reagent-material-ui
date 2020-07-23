(ns reagent-material-ui.icons.local-cafe-two-tone
  "Imports @material-ui/icons/LocalCafeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def local-cafe-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M8 15h6c1.1 0 2-.9 2-2V5H6v8c0 1.1.9 2 2 2z", "opacity" ".3"}) (e "path" #js {"d" "M2 19h18v2H2zm2-6c0 2.21 1.79 4 4 4h6c2.21 0 4-1.79 4-4v-3h2c1.11 0 2-.89 2-2V5c0-1.11-.89-2-2-2H4v10zm14-8h2v3h-2V5zM6 5h10v8c0 1.1-.9 2-2 2H8c-1.1 0-2-.9-2-2V5z"}))
                                          "LocalCafeTwoTone"))
