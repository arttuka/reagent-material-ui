(ns reagent-material-ui.icons.network-cell-outlined
  "Imports @material-ui/icons/NetworkCellOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def network-cell-outlined (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M2 22h20V2L2 22z", "fillOpacity" ".3"}) (e "path" #js {"d" "M17 7L2 22h15V7z"}))
                                            "NetworkCellOutlined"))
