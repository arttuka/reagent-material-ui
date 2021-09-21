(ns reagent-mui.icons.view-compact-two-tone
  "Imports @mui/icons-material/ViewCompactTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def view-compact-two-tone (create-svg-icon [(e "path" #js {"d" "M11 13h9v4h-9zm-6 0h4v4H5zm0-6h15v4H5z", "opacity" ".3"}) (e "path" #js {"d" "M3 5v14h19V5H3zm6 12H5v-4h4v4zm11 0h-9v-4h9v4zm0-6H5V7h15v4z"})]
                                            "ViewCompactTwoTone"))
