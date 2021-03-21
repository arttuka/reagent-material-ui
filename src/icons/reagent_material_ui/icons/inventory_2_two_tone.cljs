(ns reagent-material-ui.icons.inventory-2-two-tone
  "Imports @material-ui/icons/Inventory2TwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def inventory-2-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 7h16V3.98L4 4zm1 13h14V9H5v11zm4-8h6v2H9v-2z", "opacity" ".3"}) (e "path" #js {"d" "M20 2H4c-1 0-2 .9-2 2v3.01c0 .72.43 1.34 1 1.69V20c0 1.1 1.1 2 2 2h14c.9 0 2-.9 2-2V8.7c.57-.35 1-.97 1-1.69V4c0-1.1-1-2-2-2zm-1 18H5V9h14v11zm1-13H4V4l16-.02V7z"}) (e "path" #js {"d" "M9 12h6v2H9z"}))
                                           "Inventory2TwoTone"))
