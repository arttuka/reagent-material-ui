(ns reagent-material-ui.icons.vertical-split-two-tone
  "Imports @material-ui/icons/VerticalSplitTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def vertical-split-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15 7h4v10h-4z", "opacity" ".3"}) (e "path" #js {"d" "M3 13h8v2H3zm0 4h8v2H3zm0-8h8v2H3zm0-4h8v2H3zm10 0v14h8V5h-8zm6 12h-4V7h4v10z"}))
                                              "VerticalSplitTwoTone"))
