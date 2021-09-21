(ns reagent-mui.icons.assistant-photo-sharp
  "Imports @mui/icons-material/AssistantPhotoSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def assistant-photo-sharp (create-svg-icon (e "path" #js {"d" "M14.4 6 14 4H5v17h2v-7h5.6l.4 2h7V6h-5.6z"})
                                            "AssistantPhotoSharp"))
