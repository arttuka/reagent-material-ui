(ns reagent-material-ui.icons.menu-sharp
  "Imports @material-ui/icons/MenuSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def menu-sharp (create-svg-icon (e "path" #js {"d" "M3 18h18v-2H3v2zm0-5h18v-2H3v2zm0-7v2h18V6H3z"})
                                 "MenuSharp"))
