(ns reagent-material-ui.icons.edit-road-two-tone
  "Imports @material-ui/icons/EditRoadTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def edit-road-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M15.55 17.42v1.03h1.03L20.03 15 19 13.97z", "opacity" ".3"}) (e "path" #js {"d" "M18 4h-2v7.9l2-2zM4 4h2v16H4zm6 0h2v4h-2zm0 6h2v4h-2zm0 6h2v4h-2zm12.56-3.41l-1.15-1.15c-.59-.59-1.54-.59-2.12 0L14 16.73V20h3.27l5.29-5.29c.59-.59.59-1.54 0-2.12zm-5.98 5.86h-1.03v-1.03L19 13.97 20.03 15l-3.45 3.45z"}))
                                         "EditRoadTwoTone"))
