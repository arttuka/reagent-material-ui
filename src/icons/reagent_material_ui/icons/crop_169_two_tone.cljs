(ns reagent-material-ui.icons.crop-169-two-tone
  "Imports @material-ui/icons/Crop169TwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def crop-169-two-tone (create-svg-icon (e "path" #js {"d" "M19 6H5c-1.1 0-2 .9-2 2v8c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm0 10H5V8h14v8z"})
                                        "Crop169TwoTone"))
