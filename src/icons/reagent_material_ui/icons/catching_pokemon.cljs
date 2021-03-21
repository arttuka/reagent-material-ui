(ns reagent-material-ui.icons.catching-pokemon
  "Imports @material-ui/icons/CatchingPokemon as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def catching-pokemon (create-svg-icon (e "path" #js {"d" "M14.5 12c0 1.38-1.12 2.5-2.5 2.5S9.5 13.38 9.5 12s1.12-2.5 2.5-2.5 2.5 1.12 2.5 2.5zm7.5 0c0 5.52-4.48 10-10 10S2 17.52 2 12 6.48 2 12 2s10 4.48 10 10zm-2 0h-4c0-2.21-1.79-4-4-4s-4 1.79-4 4H4c0 4.41 3.59 8 8 8s8-3.59 8-8z"})
                                       "CatchingPokemon"))
