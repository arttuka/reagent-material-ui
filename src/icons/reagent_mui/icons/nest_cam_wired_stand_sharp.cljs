(ns reagent-mui.icons.nest-cam-wired-stand-sharp
  "Imports @mui/icons-material/NestCamWiredStandSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def nest-cam-wired-stand-sharp (create-svg-icon (e "path" #js {"d" "m18 .85-6.02.55C8.95 1.7 6.37 4 6.04 7.03c-.39 3.57 2.2 6.69 5.68 7.04l1.9.19-.56.85c-.88-.19-1.83-.18-2.85.25-2 .85-3.21 2.89-3.21 5.05V23h10v-3c0-1.67-.83-3.15-2.09-4.06l.97-1.45 2.12.23V.85z"})
                                                 "NestCamWiredStandSharp"))
