(ns reagent-material-ui.icons.shop-2-outlined
  "Imports @material-ui/icons/Shop2Outlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def shop-2-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M3 9H1v11c0 1.11.89 2 2 2h16v-2H3V9z"}) (e "path" #js {"d" "M18 5V3c0-1.11-.89-2-2-2h-4c-1.11 0-2 .89-2 2v2H5v11c0 1.11.89 2 2 2h14c1.11 0 2-.89 2-2V5h-5zm-6-2h4v2h-4V3zm9 13H7V7h14v9z"}) (e "path" #js {"d" "M12 8v7l5.5-3.5z"}))
                                      "Shop2Outlined"))
