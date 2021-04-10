(ns reagent-material-ui.icons.videogame-asset-outlined
  "Imports @material-ui/icons/VideogameAssetOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def videogame-asset-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M21 6H3c-1.1 0-2 .9-2 2v8c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2zm0 10H3V8h18v8zM6 15h2v-2h2v-2H8V9H6v2H4v2h2z"}) (e "circle" #js {"cy" "13.5", "r" "1.5", "cx" "14.5"}) (e "circle" #js {"cy" "10.5", "r" "1.5", "cx" "18.5"}))
                                               "VideogameAssetOutlined"))
