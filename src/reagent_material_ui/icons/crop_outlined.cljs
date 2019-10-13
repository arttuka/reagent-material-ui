(ns reagent-material-ui.icons.crop-outlined
  "Imports @material-ui/icons/CropOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def crop-outlined (create-svg-icon (e "path" #js {"d" "M17 15h2V7c0-1.1-.9-2-2-2H9v2h8v8zM7 17V1H5v4H1v2h4v10c0 1.1.9 2 2 2h10v4h2v-4h4v-2H7z"})
                                    "CropOutlined"))
