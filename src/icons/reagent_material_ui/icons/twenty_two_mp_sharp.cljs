(ns reagent-material-ui.icons.twenty-two-mp-sharp
  "Imports @material-ui/icons/TwentyTwoMpSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def twenty-two-mp-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M3 3v18h18V3H3zm3.5 5h3V7h-3V5.5H11V9H8v1h3v1.5H6.5V8zm6 10.5H11V14h-1v3H8.5v-3h-1v4.5H6v-6h6.5v6zM13 8h3V7h-3V5.5h4.5V9h-3v1h3v1.5H13V8zm5 9h-3v1.5h-1.5v-6H18V17z"}) (e "path" #js {"d" "M15 14h1.5v1.5H15z"}))
                                          "TwentyTwoMpSharp"))
