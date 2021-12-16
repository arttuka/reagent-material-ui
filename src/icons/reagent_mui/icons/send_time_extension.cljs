(ns reagent-mui.icons.send-time-extension
  "Imports @mui/icons-material/SendTimeExtension as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def send-time-extension (create-svg-icon [(e "path" #js {"d" "M20 6c0-1.1-.9-2-2-2h-4c0-1.38-1.12-2.5-2.5-2.5S9 2.62 9 4H5.01c-1.1 0-2 .9-2 2v3.8C5.7 9.8 6 11.96 6 12.5s-.29 2.7-3 2.7V19c0 1.1.9 2 2 2h3.8c0-2.16 1.37-2.78 2.2-2.94v-9.3l9 4.5V6z"}) (e "path" #js {"d" "M13 12v4l4 1-4 1v4l10-5z"})]
                                          "SendTimeExtension"))
