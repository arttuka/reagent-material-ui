(ns reagent-mui.icons.send-time-extension-sharp
  "Imports @mui/icons-material/SendTimeExtensionSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def send-time-extension-sharp (create-svg-icon [(e "path" #js {"d" "M20 4h-6c0-1.38-1.12-2.5-2.5-2.5S9 2.62 9 4H3.01v5.8C5.7 9.8 6 11.96 6 12.5s-.29 2.7-3 2.7V21h5.8c0-2.16 1.37-2.78 2.2-2.94v-9.3l9 4.5V4z"}) (e "path" #js {"d" "M13 12v4l4 1-4 1v4l10-5z"})]
                                                "SendTimeExtensionSharp"))
