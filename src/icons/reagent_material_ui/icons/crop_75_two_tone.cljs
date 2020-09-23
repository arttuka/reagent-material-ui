(ns reagent-material-ui.icons.crop-75-two-tone
  "Imports @material-ui/icons/Crop75TwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def crop-75-two-tone (create-svg-icon (e "path" #js {"d" "M19 7H5c-1.1 0-2 .9-2 2v6c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V9c0-1.1-.9-2-2-2zm0 8H5V9h14v6z"})
                                       "Crop75TwoTone"))
