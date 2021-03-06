(ns reagent-material-ui.icons.grid-view-two-tone
  "Imports @material-ui/icons/GridViewTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def grid-view-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M5 5h4v4H5zm0 10h4v4H5zm10 0h4v4h-4zm0-10h4v4h-4z", "opacity" ".3"}) (e "path" #js {"d" "M3 21h8v-8H3v8zm2-6h4v4H5v-4zm-2-4h8V3H3v8zm2-6h4v4H5V5zm8 16h8v-8h-8v8zm2-6h4v4h-4v-4zM13 3v8h8V3h-8zm6 6h-4V5h4v4z"}))
                                         "GridViewTwoTone"))
