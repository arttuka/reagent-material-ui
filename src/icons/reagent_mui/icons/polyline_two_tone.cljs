(ns reagent-mui.icons.polyline-two-tone
  "Imports @mui/icons-material/PolylineTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def polyline-two-tone (create-svg-icon [(e "path" #js {"d" "M12 4h2v2h-2V4zM7 14H5v-2h2v2zm12 6h-2v-2h2v2z", "opacity" ".3"}) (e "path" #js {"d" "M15 16v1.26l-6-3v-3.17L11.7 8H16V2h-6v4.9L7.3 10H3v6h5l7 3.5V22h6v-6h-6zM12 4h2v2h-2V4zM7 14H5v-2h2v2zm12 6h-2v-2h2v2z"})]
                                        "PolylineTwoTone"))
