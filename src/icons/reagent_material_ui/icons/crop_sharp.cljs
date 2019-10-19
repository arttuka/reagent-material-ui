(ns reagent-material-ui.icons.crop-sharp
  "Imports @material-ui/icons/CropSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def crop-sharp (create-svg-icon (e "path" #js {"d" "M17 15h2V5H9v2h8v8zM7 17V1H5v4H1v2h4v12h12v4h2v-4h4v-2H7z"})
                                 "CropSharp"))
