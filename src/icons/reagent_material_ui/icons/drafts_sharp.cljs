(ns reagent-material-ui.icons.drafts-sharp
  "Imports @material-ui/icons/DraftsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def drafts-sharp (create-svg-icon (e "path" #js {"d" "M21.99 6.86L12 1 2 6.86V20h20l-.01-13.14zM12 13L3.74 7.84 12 3l8.26 4.84L12 13z"})
                                   "DraftsSharp"))
