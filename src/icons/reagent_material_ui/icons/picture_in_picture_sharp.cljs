(ns reagent-material-ui.icons.picture-in-picture-sharp
  "Imports @material-ui/icons/PictureInPictureSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def picture-in-picture-sharp (create-svg-icon (e "path" #js {"d" "M19 7h-8v6h8V7zm4-4H1v17.98h22V3zm-2 16.01H3V4.98h18v14.03z"})
                                               "PictureInPictureSharp"))
