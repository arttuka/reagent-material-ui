(ns reagent-material-ui.icons.crop-two-tone
  "Imports @material-ui/icons/CropTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def crop-two-tone (create-svg-icon (e "path" #js {"d" "M5 17c0 1.1.9 2 2 2h10v4h2v-4h4v-2H7V1H5v4H1v2h4v10zm14-2V7c0-1.1-.9-2-2-2H9v2h8v8h2z"})
                                    "CropTwoTone"))
