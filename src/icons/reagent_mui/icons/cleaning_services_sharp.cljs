(ns reagent-mui.icons.cleaning-services-sharp
  "Imports @mui/icons-material/CleaningServicesSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def cleaning-services-sharp (create-svg-icon (e "path" #js {"d" "M15 11V1H9v10H3v12h18V11h-6zm4 10h-2v-4h-2v4h-2v-4h-2v4H9v-4H7v4H5v-8h14v8z"})
                                              "CleaningServicesSharp"))
