(ns reagent-mui.icons.videogame-asset-outlined
  "Imports @mui/icons-material/VideogameAssetOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def videogame-asset-outlined (create-svg-icon [(e "path" #js {"d" "M21 6H3c-1.1 0-2 .9-2 2v8c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm0 10H3V8h18v8zM6 15h2v-2h2v-2H8V9H6v2H4v2h2z"}) (e "circle" #js {"cx" "14.5", "cy" "13.5", "r" "1.5"}) (e "circle" #js {"cx" "18.5", "cy" "10.5", "r" "1.5"})]
                                               "VideogameAssetOutlined"))
