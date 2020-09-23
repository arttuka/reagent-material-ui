(ns reagent-material-ui.icons.view-compact-two-tone
  "Imports @material-ui/icons/ViewCompactTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-compact-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M11 13h9v4h-9zm-6 0h4v4H5zm0-6h15v4H5z", "opacity" ".3"}) (e "path" #js {"d" "M3 5v14h19V5H3zm6 12H5v-4h4v4zm11 0h-9v-4h9v4zm0-6H5V7h15v4z"}))
                                            "ViewCompactTwoTone"))
