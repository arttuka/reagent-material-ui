(ns reagent-material-ui.icons.twelve-mp-sharp
  "Imports @material-ui/icons/TwelveMpSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def twelve-mp-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M3 3v18h18V3H3zm9 5h3V7h-3V5.5h4.5V9h-3v1h3v1.5H12V8zM7 5.5h3v6H8.5V7H7V5.5zm5.5 13H11V14h-1v3H8.5v-3h-1v4.5H6v-6h6.5v6zM18 17h-3v1.5h-1.5v-6H18V17z"}) (e "path" #js {"d" "M15 14h1.5v1.5H15z"}))
                                      "TwelveMpSharp"))
