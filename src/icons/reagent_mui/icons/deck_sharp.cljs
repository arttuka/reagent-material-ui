(ns reagent-mui.icons.deck-sharp
  "Imports @mui/icons-material/DeckSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def deck-sharp (create-svg-icon [(e "path" #js {"d" "M22 9 12 2 2 9h9v13h2V9z"}) (e "path" #js {"d" "m4.14 12-1.96.37.82 4.37V22h2l.02-4H7v4h2v-6H4.9zm14.96 4H15v6h2v-4h1.98l.02 4h2v-5.26l.82-4.37-1.96-.37z"})]
                                 "DeckSharp"))
