(ns reagent-material-ui.icons.hide-image-two-tone
  "Imports @material-ui/icons/HideImageTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def hide-image-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M16.17 19l-2-2H6l3-4 2.25 3 .82-1.1L5 7.83V19zM7.83 5L19 16.17V5z", "opacity" ".3"}) (e "path" #js {"d" "M19 5v11.17l2 2V5c0-1.1-.9-2-2-2H5.83l2 2H19zM2.81 2.81L1.39 4.22 3 5.83V19c0 1.1.9 2 2 2h13.17l1.61 1.61 1.41-1.41L2.81 2.81zM5 19V7.83l7.07 7.07-.82 1.1L9 13l-3 4h8.17l2 2H5z"}))
                                          "HideImageTwoTone"))
