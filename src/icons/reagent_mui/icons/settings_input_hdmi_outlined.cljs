(ns reagent-mui.icons.settings-input-hdmi-outlined
  "Imports @mui/icons-material/SettingsInputHdmiOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def settings-input-hdmi-outlined (create-svg-icon (e "path" #js {"d" "M18 7V4c0-1.1-.9-2-2-2H8c-1.1 0-2 .9-2 2v3H5v6l3 6v3h8v-3l3-6V7h-1zM8 4h8v3h-2.01V5h-1v2H11V5h-1v2H8V4zm9 8.53-3 6V20h-4v-1.47l-3-6V9h10v3.53z"})
                                                   "SettingsInputHdmiOutlined"))
