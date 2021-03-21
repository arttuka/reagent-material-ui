(ns reagent-material-ui.icons.four-mp-sharp
  "Imports @material-ui/icons/FourMpSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def four-mp-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15 14h1.5v1.5H15z"}) (e "path" #js {"d" "M3 3v18h18V3H3zm9.5 15.5H11V14h-1v3H8.5v-3h-1v4.5H6v-6h6.5v6zm-3-8.5V5.5H11v3h1.5v-3H14v3h1V10h-1v1.5h-1.5V10h-3zm8.5 7h-3v1.5h-1.5v-6H18V17z"}))
                                    "FourMpSharp"))
