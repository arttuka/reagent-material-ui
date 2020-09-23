(ns reagent-material-ui.icons.settings-input-hdmi-sharp
  "Imports @material-ui/icons/SettingsInputHdmiSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def settings-input-hdmi-sharp (create-svg-icon (e "path" #js {"d" "M18 7V2H6v5H5v6l3 6v3h8v-3l3-6V7h-1zM8 4h8v3h-2V5h-1v2h-2V5h-1v2H8V4z"})
                                                "SettingsInputHdmiSharp"))
