(ns reagent-material-ui.icons.eightteen-mp-sharp
  "Imports @material-ui/icons/EightteenMpSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def eightteen-mp-sharp (create-svg-icon [(e "path" #js {"d" "M13.5 9H15v1.5h-1.5zm0-2.5H15V8h-1.5z"}) (e "path" #js {"d" "M3 3v18h18V3H3zm9 2.5h4.5v6H12v-6zm-5 0h3v6H8.5V7H7V5.5zm5.5 13H11V14h-1v3H8.5v-3h-1v4.5H6v-6h6.5v6zM18 17h-3v1.5h-1.5v-6H18V17z"}) (e "path" #js {"d" "M15 14h1.5v1.5H15z"})]
                                         "EightteenMpSharp"))
