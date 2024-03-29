(ns reagent-mui.icons.tire-repair
  "Imports @mui/icons-material/TireRepair as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def tire-repair (create-svg-icon [(e "path" #js {"d" "M18 7c0 .55.45 1 1 1 .28 0 .53-.11.71-.29.4-.4 1.04-2.46 1.04-2.46s-2.06.64-2.46 1.04c-.18.18-.29.43-.29.71z"}) (e "path" #js {"d" "M19 2c-2.76 0-5 2.24-5 5 0 2.05 1.23 3.81 3 4.58V13h1v5c0 .55-.45 1-1 1s-1-.45-1-1v-2c0-1.65-1.35-3-3-3-.35 0-.69.06-1 .17V5c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h6c1.1 0 2-.9 2-2v-3c0-.55.45-1 1-1s1 .45 1 1v2c0 1.65 1.35 3 3 3s3-1.35 3-3v-5h1v-1.42c1.77-.77 3-2.53 3-4.58 0-2.76-2.24-5-5-5zM6 19.5l-2-2v-2.83l2 2v2.83zm0-5-2-2V9.67l2 2v2.83zm0-5-2-2V4.67l2 2V9.5zm4 8-2 2v-2.83l2-2v2.83zm0-5-2 2v-2.83l2-2v2.83zm0-5-2 2V6.67l2-2V7.5zm9 2.5c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3z"})]
                                  "TireRepair"))
