(ns reagent-material-ui.icons.hide-image
  "Imports @material-ui/icons/HideImage as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def hide-image (create-svg-icon (e "path" #js {"d" "M21 5c0-1.1-.9-2-2-2H5.83L21 18.17V5zM2.81 2.81 1.39 4.22 3 5.83V19c0 1.1.9 2 2 2h13.17l1.61 1.61 1.41-1.41L2.81 2.81zM6 17l3-4 2.25 3 .82-1.1 2.1 2.1H6z"})
                                 "HideImage"))
