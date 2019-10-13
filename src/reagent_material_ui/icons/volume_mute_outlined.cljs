(ns reagent-material-ui.icons.volume-mute-outlined
  "Imports @material-ui/icons/VolumeMuteOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def volume-mute-outlined (create-svg-icon (e "path" #js {"d" "M14 8.83v6.34L11.83 13H9v-2h2.83L14 8.83M16 4l-5 5H7v6h4l5 5V4z"})
                                           "VolumeMuteOutlined"))
