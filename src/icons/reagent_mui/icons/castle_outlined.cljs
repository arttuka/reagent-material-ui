(ns reagent-mui.icons.castle-outlined
  "Imports @mui/icons-material/CastleOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def castle-outlined (create-svg-icon [(e "path" #js {"d" "M21 9v2h-2V3h-2v2h-2V3h-2v2h-2V3H9v2H7V3H5v8H3V9H1v12h9v-3c0-1.1.9-2 2-2s2 .9 2 2v3h9V9h-2zm0 10h-5v-1c0-2.21-1.79-4-4-4s-4 1.79-4 4v1H3v-6h4V7h10v6h4v6z"}) (e "path" #js {"d" "M9 9h2v3H9zm4 0h2v3h-2z"})]
                                      "CastleOutlined"))
