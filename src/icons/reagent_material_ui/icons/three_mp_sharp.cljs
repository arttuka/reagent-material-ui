(ns reagent-material-ui.icons.three-mp-sharp
  "Imports @material-ui/icons/ThreeMpSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def three-mp-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M3 3v18h18V3H3zm9.5 15.5H11V14h-1v3H8.5v-3h-1v4.5H6v-6h6.5v6zM10 10h3V9h-2V8h2V7h-3V5.5h4.5v6H10V10zm8 7h-3v1.5h-1.5v-6H18V17z"}) (e "path" #js {"d" "M15 14h1.5v1.5H15z"}))
                                     "ThreeMpSharp"))
