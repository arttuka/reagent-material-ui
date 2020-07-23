(ns reagent-material-ui.icons.crop-32-two-tone
  "Imports @material-ui/icons/Crop32TwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def crop-32-two-tone (create-svg-icon (e "path" #js {"d" "M19 4H5c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2zm0 14H5V6h14v12z"})
                                       "Crop32TwoTone"))
