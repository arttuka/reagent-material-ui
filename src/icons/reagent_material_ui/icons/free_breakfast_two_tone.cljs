(ns reagent-material-ui.icons.free-breakfast-two-tone
  "Imports @material-ui/icons/FreeBreakfastTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def free-breakfast-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M6 13c0 1.1.9 2 2 2h6c1.1 0 2-.9 2-2V5H6v8z", "opacity" ".3"}) (e "path" #js {"d" "M4 19h16v2H4zM20 3H4v10c0 2.21 1.79 4 4 4h6c2.21 0 4-1.79 4-4v-3h2c1.11 0 2-.9 2-2V5c0-1.11-.89-2-2-2zm-4 10c0 1.1-.9 2-2 2H8c-1.1 0-2-.9-2-2V5h10v8zm4-5h-2V5h2v3z"}))
                                              "FreeBreakfastTwoTone"))
