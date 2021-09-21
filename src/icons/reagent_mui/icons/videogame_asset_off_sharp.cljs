(ns reagent-mui.icons.videogame-asset-off-sharp
  "Imports @mui/icons-material/VideogameAssetOffSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def videogame-asset-off-sharp (create-svg-icon (e "path" #js {"d" "M20.83 18H22V6H8.83l12 12zM17.5 9c.83 0 1.5.67 1.5 1.5s-.67 1.5-1.5 1.5-1.5-.67-1.5-1.5.67-1.5 1.5-1.5zm3.69 12.19L2.81 2.81 1.39 4.22 3.17 6H2v12h13.17l4.61 4.61 1.41-1.42zM9 13v2H7v-2H5v-2h2V9.83L10.17 13H9z"})
                                                "VideogameAssetOffSharp"))
