(ns reagent-material-ui.icons.horizontal-split-two-tone
  "Imports @material-ui/icons/HorizontalSplitTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def horizontal-split-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 15v2H5v-2h14m2-10H3v2h18V5zm0 4H3v2h18V9zm0 4H3v6h18v-6z"}) (e "path" #js {"d" "M5 15h14v2H5z", "opacity" ".3"}))
                                                "HorizontalSplitTwoTone"))
