(ns reagent-material-ui.icons.horizontal-split-outlined
  "Imports @material-ui/icons/HorizontalSplitOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def horizontal-split-outlined (create-svg-icon (e "path" #js {"d" "M19 15v2H5v-2h14m2-10H3v2h18V5zm0 4H3v2h18V9zm0 4H3v6h18v-6z"})
                                                "HorizontalSplitOutlined"))
