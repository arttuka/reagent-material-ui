(ns reagent-material-ui.icons.nat-two-tone
  "Imports @material-ui/icons/NatTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def nat-two-tone (create-svg-icon [(e "circle" #js {"cx" "4", "cy" "12", "r" "1", "opacity" ".3"}) (e "path" #js {"d" "M6.82 13H11v-2H6.82C6.4 9.84 5.3 9 4 9c-1.66 0-3 1.34-3 3s1.34 3 3 3c1.3 0 2.4-.84 2.82-2zM4 13c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z"}) (e "path" #js {"d" "m23 12-4-3v2h-4.05c-.5-5.05-4.76-9-9.95-9v2c4.42 0 8 3.58 8 8s-3.58 8-8 8v2c5.19 0 9.45-3.95 9.95-9H19v2l4-3z"})]
                                   "NatTwoTone"))
