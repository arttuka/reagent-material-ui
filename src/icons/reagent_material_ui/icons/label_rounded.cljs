(ns reagent-material-ui.icons.label-rounded
  "Imports @material-ui/icons/LabelRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def label-rounded (create-svg-icon (e "path" #js {"d" "M16.63 5.84C16.26 5.31 15.65 5 15 5H5c-1.1 0-2 .9-2 2v10c0 1.1.9 2 2 2h10c.65 0 1.26-.32 1.63-.84l3.55-5c.49-.69.49-1.62 0-2.31l-3.55-5.01z"})
                                    "LabelRounded"))
