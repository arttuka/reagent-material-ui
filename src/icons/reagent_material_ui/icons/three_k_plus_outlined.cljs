(ns reagent-material-ui.icons.three-k-plus-outlined
  "Imports @material-ui/icons/ThreeKPlusOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def three-k-plus-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm0 8.5h-1.5V10h-1v1.5H15v1h1.5V14h1v-1.5H19V19H5V5h14v6.5z"}) (e "path" #js {"d" "M10 14v-4c0-.55-.45-1-1-1H5.5v1.5h3v1h-2v1h2v1h-3V15H9c.55 0 1-.45 1-1zm2.5-1.25L14.25 15H16l-2.25-3L16 9h-1.75l-1.75 2.25V9H11v6h1.5z"}))
                                            "ThreeKPlusOutlined"))