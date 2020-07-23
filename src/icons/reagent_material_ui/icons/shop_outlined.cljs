(ns reagent-material-ui.icons.shop-outlined
  "Imports @material-ui/icons/ShopOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def shop-outlined (create-svg-icon (e "path" #js {"d" "M16 6V4c0-1.11-.89-2-2-2h-4c-1.11 0-2 .89-2 2v2H2v13c0 1.11.89 2 2 2h16c1.11 0 2-.89 2-2V6h-6zm-6-2h4v2h-4V4zm10 15H4V8h16v11zM9 18l7.5-5L9 9z"})
                                    "ShopOutlined"))
