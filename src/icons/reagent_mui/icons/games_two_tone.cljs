(ns reagent-mui.icons.games-two-tone
  "Imports @mui/icons-material/GamesTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def games-two-tone (create-svg-icon [(e "path" #js {"d" "M11 17.33V20h2v-2.67l-1-1zm2-10.66V4h-2v2.67l1 1zM16.33 12l1 1H20v-2h-2.67zM4 11v2h2.67l1-1-1-1z", "opacity" ".3"}) (e "path" #js {"d" "M2 9v6h5.5l3-3-3-3H2zm4.67 4H4v-2h2.67l1 1-1 1zM22 9h-5.5l-3 3 3 3H22V9zm-2 4h-2.67l-1-1 1-1H20v2zm-5 3.5-3-3-3 3V22h6v-5.5zM13 20h-2v-2.67l1-1 1 1V20zM9 7.5l3 3 3-3V2H9v5.5zM11 4h2v2.67l-1 1-1-1V4z"})]
                                     "GamesTwoTone"))
