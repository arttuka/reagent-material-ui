(ns reagent-material-ui.icons.style-sharp
  "Imports @material-ui/icons/StyleSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def style-sharp (create-svg-icon (e "path" #js {"d" "M3.87 20.21v-9.03l-3.19 7.7 3.19 1.33zm18.92-2.43L16.31 2.14 5.26 6.71l6.48 15.64 11.05-4.57zM7.88 8.75c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm-2 13h3.45l-3.45-8.34v8.34z"})
                                  "StyleSharp"))
