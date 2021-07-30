(ns reagent-material-ui.icons.view-array
  "Imports @material-ui/icons/ViewArray as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-array (create-svg-icon (e "path" #js {"d" "M21 5h-3v14h3V5zm-4 0H7v14h10V5zM6 5H3v14h3V5z"})
                                 "ViewArray"))
