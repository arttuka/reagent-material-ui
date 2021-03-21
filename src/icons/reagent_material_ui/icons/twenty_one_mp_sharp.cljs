(ns reagent-material-ui.icons.twenty-one-mp-sharp
  "Imports @material-ui/icons/TwentyOneMpSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def twenty-one-mp-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15 14h1.5v1.5H15z"}) (e "path" #js {"d" "M3 3v18h18V3H3zm4.5 5h3V7h-3V5.5H12V9H9v1h3v1.5H7.5V8zm5 10.5H11V14h-1v3H8.5v-3h-1v4.5H6v-6h6.5v6zm.5-13h3v6h-1.5V7H13V5.5zM18 17h-3v1.5h-1.5v-6H18V17z"}))
                                          "TwentyOneMpSharp"))
