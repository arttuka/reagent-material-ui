(ns reagent-mui.icons.tire-repair-sharp
  "Imports @mui/icons-material/TireRepairSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def tire-repair-sharp (create-svg-icon [(e "path" #js {"d" "M18 7c0 .55.45 1 1 1 .28 0 .53-.11.71-.29.4-.4 1.04-2.46 1.04-2.46s-2.06.64-2.46 1.04c-.18.18-.29.43-.29.71z"}) (e "path" #js {"d" "M19 2c-2.76 0-5 2.24-5 5 0 2.05 1.23 3.81 3 4.58V13h1v6h-2v-6h-4V5c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h6c1.1 0 2-.9 2-2v-4h2v6h6v-8h1v-1.42c1.77-.77 3-2.53 3-4.58 0-2.76-2.24-5-5-5zM6 19.5l-2-2v-2.83l2 2v2.83zm0-5-2-2V9.67l2 2v2.83zm0-5-2-2V4.67l2 2V9.5zm4 8-2 2v-2.83l2-2v2.83zm0-5-2 2v-2.83l2-2v2.83zm0-5-2 2V6.67l2-2V7.5zm9 2.5c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3z"})]
                                        "TireRepairSharp"))
