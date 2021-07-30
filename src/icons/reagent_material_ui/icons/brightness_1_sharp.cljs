(ns reagent-material-ui.icons.brightness-1-sharp
  "Imports @material-ui/icons/Brightness1Sharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def brightness-1-sharp (create-svg-icon (e "circle" #js {"cx" "12", "cy" "12", "r" "10"})
                                         "Brightness1Sharp"))
