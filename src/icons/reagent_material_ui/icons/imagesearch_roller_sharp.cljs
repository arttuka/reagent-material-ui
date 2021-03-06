(ns reagent-material-ui.icons.imagesearch-roller-sharp
  "Imports @material-ui/icons/ImagesearchRollerSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def imagesearch-roller-sharp (create-svg-icon (e "path" #js {"d" "M20 2v6H6V6H4v4h10v5h2v8h-6v-8h2v-3H2V4h4V2h14z"})
                                               "ImagesearchRollerSharp"))