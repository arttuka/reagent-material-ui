(ns reagent-mui.icons.mobile-screen-share-two-tone
  "Imports @mui/icons-material/MobileScreenShareTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mobile-screen-share-two-tone (create-svg-icon [(e "path" #js {"d" "M7 19h10V5H7v14zm5.8-8.28v-1.7L16 12l-3.2 2.99v-1.75c-2.22 0-3.69.68-4.8 2.18.45-2.14 1.69-4.27 4.8-4.7z", "opacity" ".3"}) (e "path" #js {"d" "M17 1H7c-1.1 0-1.99.85-1.99 1.95v18C5.01 22.05 5.9 23 7 23h10c1.1 0 2-.95 2-2.05V3c0-1.1-.9-2-2-2zm0 18H7V5h10v14zm-4.2-5.76v1.75L16 12l-3.2-2.98v1.7c-3.11.43-4.35 2.56-4.8 4.7 1.11-1.5 2.58-2.18 4.8-2.18z"})]
                                                   "MobileScreenShareTwoTone"))
