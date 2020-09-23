(ns reagent-material-ui.icons.crop-square-outlined
  "Imports @material-ui/icons/CropSquareOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def crop-square-outlined (create-svg-icon (e "path" #js {"d" "M18 4H6c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 14H6V6h12v12z"})
                                           "CropSquareOutlined"))
