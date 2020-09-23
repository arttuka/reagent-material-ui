(ns reagent-material-ui.icons.article-sharp
  "Imports @material-ui/icons/ArticleSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def article-sharp (create-svg-icon (e "path" #js {"d" "M3 3v18h18V3H3zm11 14H7v-2h7v2zm3-4H7v-2h10v2zm0-4H7V7h10v2z"})
                                    "ArticleSharp"))
