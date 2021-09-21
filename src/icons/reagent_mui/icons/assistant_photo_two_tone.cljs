(ns reagent-mui.icons.assistant-photo-two-tone
  "Imports @mui/icons-material/AssistantPhotoTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def assistant-photo-two-tone (create-svg-icon [(e "path" #js {"d" "m14.24 12 .4 2H18V8h-5.24l-.4-2H7v6z", "opacity" ".3"}) (e "path" #js {"d" "M7 14h5.6l.4 2h7V6h-5.6L14 4H5v17h2v-7zm0-8h5.36l.4 2H18v6h-3.36l-.4-2H7V6z"})]
                                               "AssistantPhotoTwoTone"))
