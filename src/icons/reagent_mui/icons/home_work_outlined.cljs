(ns reagent-mui.icons.home-work-outlined
  "Imports @mui/icons-material/HomeWorkOutlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def home-work-outlined (create-svg-icon [(e "path" #js {"d" "M1 11v10h6v-5h2v5h6V11L8 6l-7 5zm12 8h-2v-5H5v5H3v-6.97l5-3.57 5 3.57V19zm4-12h2v2h-2zm0 4h2v2h-2zm0 4h2v2h-2z"}) (e "path" #js {"d" "M10 3v1.97l2 1.43V5h9v14h-4v2h6V3z"})]
                                         "HomeWorkOutlined"))
