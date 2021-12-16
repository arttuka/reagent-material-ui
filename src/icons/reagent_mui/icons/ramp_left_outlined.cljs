(ns reagent-mui.icons.ramp-left-outlined
  "Imports @mui/icons-material/RampLeftOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def ramp-left-outlined (create-svg-icon (e "path" #js {"d" "M13 21h-2V6.83L9.41 8.41 8 7l4-4 4 4-1.41 1.41L13 6.83V9c0 4.27 4.03 7.13 6 8.27l-1.46 1.46c-1.91-1.16-3.44-2.53-4.54-4.02V21z"})
                                         "RampLeftOutlined"))
