(ns reagent-material-ui.icons.store-two-tone
  "Imports @material-ui/icons/StoreTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def store-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5.64 9l-.6 3h13.92l-.6-3z", "opacity" ".3"}) (e "path" #js {"d" "M4 4h16v2H4zm16 3H4l-1 5v2h1v6h10v-6h4v6h2v-6h1v-2l-1-5zm-8 11H6v-4h6v4zm-6.96-6l.6-3h12.72l.6 3H5.04z"}))
                                     "StoreTwoTone"))
