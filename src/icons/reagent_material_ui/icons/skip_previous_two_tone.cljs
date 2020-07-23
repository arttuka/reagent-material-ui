(ns reagent-material-ui.icons.skip-previous-two-tone
  "Imports @material-ui/icons/SkipPreviousTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def skip-previous-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M16 14.14V9.86L12.97 12z", "opacity" ".3"}) (e "path" #js {"d" "M6 6h2v12H6zm12 12V6l-8.5 6 8.5 6zm-2-3.86L12.97 12 16 9.86v4.28z"}))
                                             "SkipPreviousTwoTone"))
