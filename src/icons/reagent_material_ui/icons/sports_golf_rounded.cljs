(ns reagent-material-ui.icons.sports-golf-rounded
  "Imports @material-ui/icons/SportsGolfRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sports-golf-rounded (create-svg-icon [(e "path" #js {"d" "M12 16c3.87 0 7-3.13 7-7s-3.13-7-7-7-7 3.13-7 7 3.13 7 7 7zm0-12c2.76 0 5 2.24 5 5s-2.24 5-5 5-5-2.24-5-5 2.24-5 5-5z"}) (e "circle" #js {"cx" "10", "cy" "8", "r" "1"}) (e "circle" #js {"cx" "14", "cy" "8", "r" "1"}) (e "circle" #js {"cx" "12", "cy" "6", "r" "1"}) (e "path" #js {"d" "M16 17H8c-.55 0-1 .45-1 1s.45 1 1 1h1c1.1 0 2 .9 2 2v1h2v-1c0-1.1.9-2 2-2h1c.55 0 1-.45 1-1s-.45-1-1-1z"})]
                                          "SportsGolfRounded"))
