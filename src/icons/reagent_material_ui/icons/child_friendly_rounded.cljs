(ns reagent-material-ui.icons.child-friendly-rounded
  "Imports @material-ui/icons/ChildFriendlyRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def child-friendly-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "20.5", "r" "1.5", "cx" "8.5"}) (e "circle" #js {"cy" "20.5", "r" "1.5", "cx" "19.5"}) (e "path" #js {"d" "M16.98 2.65c-2.85-1.26-6.12-.36-7.39.26L13.5 7.6l3.74-3.28c.55-.48.41-1.38-.26-1.67zm1.79 13.71L8.57 4.03C7.93 3.27 7.05 2 5.39 2c-1.41 0-2.63.89-3.13 2.15-.26.64.26 1.33.95 1.33.4 0 .76-.23.91-.6.21-.52.7-.88 1.27-.88.68 0 1.03.59 1.61 1.27V13c0 2.75 2.25 5 5 5h6c.85 0 1.31-.99.77-1.64z"}))
                                             "ChildFriendlyRounded"))
