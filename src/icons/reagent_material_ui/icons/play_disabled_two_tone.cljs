(ns reagent-material-ui.icons.play-disabled-two-tone
  "Imports @material-ui/icons/PlayDisabledTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def play-disabled-two-tone (create-svg-icon [(e "path" #js {"d" "M10 12.83v2.53l1.55-.99z", "opacity" ".3"}) (e "path" #js {"d" "M2.81 2.81 1.39 4.22 8 10.83V19l4.99-3.18 6.78 6.78 1.41-1.41L2.81 2.81zM10 15.36v-2.53l1.55 1.55-1.55.98zM19 12 8 5v.17l8.45 8.45L19 12z"})]
                                             "PlayDisabledTwoTone"))
