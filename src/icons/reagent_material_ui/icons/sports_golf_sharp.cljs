(ns reagent-material-ui.icons.sports-golf-sharp
  "Imports @material-ui/icons/SportsGolfSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sports-golf-sharp (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M12 16c3.87 0 7-3.13 7-7s-3.13-7-7-7-7 3.13-7 7 3.13 7 7 7zm0-12c2.76 0 5 2.24 5 5s-2.24 5-5 5-5-2.24-5-5 2.24-5 5-5z"}) (e "circle" #js {"cy" "8", "r" "1", "cx" "10"}) (e "circle" #js {"cy" "8", "r" "1", "cx" "14"}) (e "circle" #js {"cy" "6", "r" "1", "cx" "12"}) (e "path" #js {"d" "M7 19h2c1.1 0 2 .9 2 2v1h2v-1c0-1.1.9-2 2-2h2v-2H7v2z"}))
                                        "SportsGolfSharp"))
