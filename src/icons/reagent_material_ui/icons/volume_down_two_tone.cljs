(ns reagent-material-ui.icons.volume-down-two-tone
  "Imports @material-ui/icons/VolumeDownTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def volume-down-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M7 13h2.83L12 15.17V8.83L9.83 11H7z", "opacity" ".3"}) (e "path" #js {"d" "M16 7.97v8.05c1.48-.73 2.5-2.25 2.5-4.02 0-1.77-1.02-3.29-2.5-4.03zM5 9v6h4l5 5V4L9 9H5zm7-.17v6.34L9.83 13H7v-2h2.83L12 8.83z"}))
                                           "VolumeDownTwoTone"))
