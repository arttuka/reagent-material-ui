(ns reagent-material-ui.icons.equalizer-two-tone
  "Imports @material-ui/icons/EqualizerTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def equalizer-two-tone (create-svg-icon (e "path" #js {"d" "M16 9h4v11h-4zm-6-5h4v16h-4zm-6 8h4v8H4z"})
                                         "EqualizerTwoTone"))
