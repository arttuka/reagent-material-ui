(ns reagent-material-ui.icons.card-travel-two-tone
  "Imports @material-ui/icons/CardTravelTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def card-travel-two-tone (create-svg-icon [(e "path" #js {"d" "M4 17h16v2H4zm13-7h-2V8H9v2H7V8H4v6h16V8h-3z", "opacity" ".3"}) (e "path" #js {"d" "M20 6h-3V4c0-1.11-.89-2-2-2H9c-1.11 0-2 .89-2 2v2H4c-1.11 0-2 .89-2 2v11c0 1.11.89 2 2 2h16c1.11 0 2-.89 2-2V8c0-1.11-.89-2-2-2zM9 4h6v2H9V4zm11 15H4v-2h16v2zm0-5H4V8h3v2h2V8h6v2h2V8h3v6z"})]
                                           "CardTravelTwoTone"))
