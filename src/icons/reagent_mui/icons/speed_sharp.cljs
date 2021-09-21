(ns reagent-mui.icons.speed-sharp
  "Imports @mui/icons-material/SpeedSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def speed-sharp (create-svg-icon [(e "path" #js {"d" "m20.39 8.56-1.24 1.86a8 8 0 0 1-.22 7.58H5.07A8 8 0 0 1 15.58 6.85l1.86-1.24A10 10 0 0 0 4 20h16a10 10 0 0 0 .38-11.44z"}) (e "path" #js {"d" "M10.59 15.41a2 2 0 0 0 2.83 0l5.66-8.49-8.49 5.66a2 2 0 0 0 0 2.83z"})]
                                  "SpeedSharp"))
