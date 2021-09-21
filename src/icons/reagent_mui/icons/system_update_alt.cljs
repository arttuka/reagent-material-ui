(ns reagent-mui.icons.system-update-alt
  "Imports @mui/icons-material/SystemUpdateAlt as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def system-update-alt (create-svg-icon (e "path" #js {"d" "m12 16.5 4-4h-3v-9h-2v9H8l4 4zm9-13h-6v1.99h6v14.03H3V5.49h6V3.5H3c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2v-14c0-1.1-.9-2-2-2z"})
                                        "SystemUpdateAlt"))
