(ns reagent-material-ui.icons.store-mall-directory-sharp
  "Imports @material-ui/icons/StoreMallDirectorySharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def store-mall-directory-sharp (create-svg-icon (e "path" #js {"d" "M20 4H4v2h16V4zm1 10v-2l-1-5H4l-1 5v2h1v6h10v-6h4v6h2v-6h1zm-9 4H6v-4h6v4z"})
                                                 "StoreMallDirectorySharp"))
