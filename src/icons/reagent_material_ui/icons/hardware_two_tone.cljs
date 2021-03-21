(ns reagent-material-ui.icons.hardware-two-tone
  "Imports @material-ui/icons/HardwareTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def hardware-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M6.77 6H11v5h2V5H9c-.89 0-1.68.39-2.23 1zM11 13h2v6h-2z", "opacity" ".3"}) (e "path" #js {"d" "M18 3l-3 3V3H9C6.24 3 4 5.24 4 8h5v12c0 .55.45 1 1 1h4c.55 0 1-.45 1-1V8l3 3h2V3h-2zm-5 16h-2v-6h2v6zm0-8h-2V6H6.77C7.32 5.39 8.11 5 9 5h4v6z"}))
                                        "HardwareTwoTone"))
