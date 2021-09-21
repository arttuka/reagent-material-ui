(ns reagent-mui.icons.nearby-error-sharp
  "Imports @mui/icons-material/NearbyErrorSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def nearby-error-sharp (create-svg-icon (e "path" #js {"d" "M12 7.58 16.42 12 12 16.42 7.58 12 12 7.58zm0 11.62L4.8 12 12 4.8l6 6V7.17l-5.99-5.99L1.18 12.01l10.83 10.83L18 16.83V13.2l-6 6zm8 .8h2v2h-2v-2zm2-10h-2v8h2v-8"})
                                         "NearbyErrorSharp"))
