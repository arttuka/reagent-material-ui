(ns reagent-material-ui.icons.mp-sharp
  "Imports @material-ui/icons/MpSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def mp-sharp (create-svg-icon (e "path" #js {"d" "M21 3H3v18h18V3zM6 9h6.5v6H11v-4.5h-1v3H8.5v-3h-1V15H6V9zm9 6h-1.5V9H18v4.5h-3V15zm0-3h1.5v-1.5H15V12z"})
                               "MpSharp"))