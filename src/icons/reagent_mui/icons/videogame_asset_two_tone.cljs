(ns reagent-mui.icons.videogame-asset-two-tone
  "Imports @mui/icons-material/VideogameAssetTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def videogame-asset-two-tone (create-svg-icon [(e "path" #js {"d" "M3 16h18V8H3v8zm15.5-7c.83 0 1.5.67 1.5 1.5s-.67 1.5-1.5 1.5-1.5-.67-1.5-1.5.67-1.5 1.5-1.5zm-4 3c.83 0 1.5.67 1.5 1.5s-.67 1.5-1.5 1.5-1.5-.67-1.5-1.5.67-1.5 1.5-1.5zM4 11h2V9h2v2h2v2H8v2H6v-2H4v-2z", "opacity" ".3"}) (e "path" #js {"d" "M21 6H3c-1.1 0-2 .9-2 2v8c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm0 10H3V8h18v8zM6 15h2v-2h2v-2H8V9H6v2H4v2h2z"}) (e "circle" #js {"cx" "14.5", "cy" "13.5", "r" "1.5"}) (e "circle" #js {"cx" "18.5", "cy" "10.5", "r" "1.5"})]
                                               "VideogameAssetTwoTone"))
