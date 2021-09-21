(ns reagent-mui.icons.assistant-photo
  "Imports @mui/icons-material/AssistantPhoto as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def assistant-photo (create-svg-icon (e "path" #js {"d" "M14.4 6 14 4H5v17h2v-7h5.6l.4 2h7V6z"})
                                      "AssistantPhoto"))
