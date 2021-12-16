(ns reagent-mui.icons.castle-two-tone
  "Imports @mui/icons-material/CastleTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def castle-two-tone (create-svg-icon [(e "path" #js {"d" "M17 7H7v6H3v6h5v-1c0-2.21 1.79-4 4-4s4 1.79 4 4v1h5v-6h-4V7zm-6 5H9V9h2v3zm4 0h-2V9h2v3z", "opacity" ".3"}) (e "path" #js {"d" "M21 9v2h-2V3h-2v2h-2V3h-2v2h-2V3H9v2H7V3H5v8H3V9H1v12h9v-3c0-1.1.9-2 2-2s2 .9 2 2v3h9V9h-2zm0 10h-5v-1c0-2.21-1.79-4-4-4s-4 1.79-4 4v1H3v-6h4V7h10v6h4v6z"}) (e "path" #js {"d" "M9 9h2v3H9zm4 0h2v3h-2z"})]
                                      "CastleTwoTone"))
