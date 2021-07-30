(ns reagent-material-ui.icons.settings-bluetooth-rounded
  "Imports @material-ui/icons/SettingsBluetoothRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def settings-bluetooth-rounded (create-svg-icon [(e "circle" #js {"cx" "12", "cy" "23", "r" "1"}) (e "circle" #js {"cx" "8", "cy" "23", "r" "1"}) (e "circle" #js {"cx" "16", "cy" "23", "r" "1"}) (e "path" #js {"d" "M13.41 10 17 6.42c.39-.39.39-1.02 0-1.42L12.21.21c-.14-.14-.32-.21-.5-.21-.39 0-.71.32-.71.71v6.88L7.11 3.71a.9959.9959 0 0 0-1.41 0c-.39.39-.39 1.02 0 1.41L10.59 10 5.7 14.89c-.39.39-.39 1.02 0 1.41.39.39 1.02.39 1.41 0L11 12.41v6.88c0 .39.32.71.71.71.19 0 .37-.07.5-.21L17 15c.39-.39.39-1.02 0-1.42L13.41 10zM13 3.83l1.88 1.88L13 7.59V3.83zm0 12.34v-3.76l1.88 1.88L13 16.17z"})]
                                                 "SettingsBluetoothRounded"))
