(ns reagent-mui.icons.assistant-direction-sharp
  "Imports @mui/icons-material/AssistantDirectionSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def assistant-direction-sharp (create-svg-icon (e "path" #js {"d" "M13.5 10H8v5h2v-3h3.5v2.5L17 11l-3.5-3.5V10zM12 1C5.9 1 1 5.9 1 12s4.9 11 11 11 11-4.9 11-11S18.1 1 12 1zm8.31 11-8.34 8.37L3.62 12l8.34-8.37L20.31 12z"})
                                                "AssistantDirectionSharp"))
