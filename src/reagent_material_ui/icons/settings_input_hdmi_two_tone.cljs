(ns reagent-material-ui.icons.settings-input-hdmi-two-tone
  "Imports @material-ui/icons/SettingsInputHdmiTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def settings-input-hdmi-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M8 9H7v3.53l2.79 5.58.21.42V20h4v-1.47l.21-.42L17 12.53V9h-1z", "opacity" ".3"}) (e "path" #js {"d" "M18 7V4c0-1.1-.9-2-2-2H8c-1.1 0-2 .9-2 2v3H5v6l3 6v3h8v-3l3-6V7h-1zM8 4h8v3h-2.01V5h-1v2H11V5h-1v2H8V4zm9 8.53l-3 6V20h-4v-1.47l-3-6V9h10v3.53z"}))
                                                   "SettingsInputHdmiTwoTone"))
